#!/bin/bash
set -euo pipefail

# IMPORTANTE: força uma locale UTF-8. Sem isso, `sed`/`tr` podem tratar
# caracteres acentuados como bytes soltos (em vez de 1 caractere) e
# corromper o texto (ex.: "Mjölnir" virando "mjaolnir"). Ajuste o nome
# da locale conforme o que estiver disponível no seu sistema
# (`locale -a` lista as opções: normalmente en_US.UTF-8, pt_BR.UTF-8 ou C.utf8).
export LC_ALL=C.utf8

# Define o pacote base comum a todos os exercícios
PACOTE_BASE="beecrowd.iniciante.p6"

# Lista de exercícios fornecida (ID e Nome) - Página 5 do Beecrowd
exercicios=$(cat << 'EOF'
1865   Mjölnir
1866   Conta
1914   De Quem é a Vez
1924   Vitória e a Indecisão
1929   Triângulo   Favorite 15.998 3
1930   Tomadas
1933   Tri-du
1957   Converter para Hexadecimal
1958   Notação Científica
1959   Polígonos Regulares Simples
1960   Numeração Romana para Números de Página
1961   Pula Sapo
1962   Há Muito, Muito Tempo Atrás
1963   O Filme
1973   Jornada nas Estrelas
1983   O Escolhido
1984   O Enigma do Pronalândia
1985   MacPRONALTS
2003   Domingo de Manhã
2006   Identificando o Chá
2028   Sequência de Sequência
2029   Reservatório de Mel
2031   Pedra, Papel, Ataque Aéreo
2057   Fuso Horário
2059   Ímpar, Par ou Roubo
EOF
)

# ---------------------------------------------------------------------------
# Função de sanitização: transforma qualquer texto em algo seguro para
# ser usado como parte de um nome de pacote/diretório Java.
# ---------------------------------------------------------------------------
sanitizar_nome() {
    local entrada="$1"
    local saida

    # 1. Remove tudo a partir da palavra "Favorite" (case-insensitive),
    #    inclusive números/estatísticas que vierem depois dela.
    saida=$(echo "$entrada" | sed -E 's/[[:space:]]+[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee].*$//')

    # 2. Transliteração manual de acentos (maiúsculas e minúsculas).
    #    Feito ANTES do tr para minúsculas porque `tr '[:upper:]'
    #    '[:lower:]'` NÃO rebaixa corretamente vogais acentuadas
    #    maiúsculas mesmo em locale UTF-8 (ex.: "Í" ficava intacto e
    #    era descartado depois, virando "Ímpar" -> "mpar"). Também não
    #    usamos `iconv //TRANSLIT` porque seu comportamento depende de
    #    tabelas de locale instaladas e pode descartar caracteres
    #    silenciosamente em vez de convertê-los. Este mapeamento manual
    #    é determinístico e independe do sistema.
    saida=$(echo "$saida" | sed '
        s/[áàãâäÁÀÃÂÄ]/a/g;
        s/[éèêëÉÈÊË]/e/g;
        s/[íìîïÍÌÎÏ]/i/g;
        s/[óòõôöÓÒÕÔÖ]/o/g;
        s/[úùûüÚÙÛÜ]/u/g;
        s/[ñÑ]/n/g;
        s/[çÇ]/c/g;
    ')

    # 3. Minúsculas (agora só precisa cobrir ASCII a-z, já sem acentos)
    saida=$(echo "$saida" | tr '[:upper:]' '[:lower:]')

    # 4. Qualquer caractere que não seja letra, número ou espaço vira espaço
    #    (isso cobre vírgula, hífen, aspas, ponto, parênteses, etc.)
    saida=$(echo "$saida" | sed -E 's/[^a-z0-9 ]+/ /g')

    # 5. Colapsa espaços múltiplos e remove espaços nas pontas
    saida=$(echo "$saida" | sed -E 's/[[:space:]]+/ /g; s/^ //; s/ $//')

    # 6. Espaços -> underscore
    saida=$(echo "$saida" | tr ' ' '_')

    # 7. Colapsa underscores duplicados e remove nas pontas
    saida=$(echo "$saida" | sed -E 's/_+/_/g; s/^_//; s/_$//')

    # 8. Fallback se por algum motivo o nome ficou vazio
    if [ -z "$saida" ]; then
        saida="exercicio"
    fi

    echo "$saida"
}

# Processa linha por linha da lista
while IFS= read -r linha; do
    [ -z "$linha" ] && continue

    id=$(echo "$linha" | awk '{print $1}')
    nome_cru=$(echo "$linha" | sed -E "s/^$id[[:space:]]+//")

    nome_formatado=$(sanitizar_nome "$nome_cru")

    sub_pacote="p${id}_${nome_formatado}"
    caminho_diretorio=$(echo "${PACOTE_BASE}.${sub_pacote}" | tr '.' '/')

    echo "Criando estrutura para: $sub_pacote..."

    mkdir -p "$caminho_diretorio"

    cat << EOL > "${caminho_diretorio}/Main.java"
package ${PACOTE_BASE}.${sub_pacote};

import java.io.IOException;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}
EOL

done <<< "$exercicios"

echo "Concluído! Estrutura de pacotes gerada com sucesso."