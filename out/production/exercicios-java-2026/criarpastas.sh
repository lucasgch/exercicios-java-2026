#!/bin/bash

# Define o pacote base comum a todos os exercícios
PACOTE_BASE="beecrowd.iniciante.p4"

# Lista de exercícios fornecida (ID e Nome)
exercicios=$(cat << 'EOF'
1145   Sequência Lógica 2
1146   Sequências Crescentes
1149   Somando Inteiros Consecutivos
1150   Ultrapassando Z
1151   Fibonacci Fácil
1153   Fatorial Simples
1154   Idades
1155   Sequência S
1156   Sequência S II
1157   Divisores I
1158   Soma de Ímpares Consecutivos III
1159   Soma de Pares Consecutivos
1160   Crescimento Populacional
1164   Número Perfeito
1165   Número Primo
1172   Substituição em Vetor I
1173   Preenchimento de Vetor I
1174   Seleçao em Vetor I
1175   Troca em Vetor I
1176   Fibonacci em Vetor
1177   Preenchimento de Vetor II
1178   Preenchimento de Vetor III
1179   Preenchimento de Vetor IV
1180   Menor e Posição   Favorite
1181   Linha na Matriz   Favorite
EOF
)

# Processa linha por linha da lista
echo "$exercicios" | while read -r linha; do
    # Pula linhas vazias se houver
    [ -z "$linha" ] && continue

    # Extrai o número do exercício (primeira palavra)
    id=$(echo "$linha" | awk '{print $1}')

    # Extrai o nome do exercício e remove o "Favorite" do final
    nome_cru=$(echo "$linha" | sed -E "s/^$id[[:space:]]+//" | sed -E "s/[[:space:]]+Favorite[[:space:]]*$//")

    # Tratamento rigoroso de caracteres:
    # 1. Transforma tudo para minúsculas primeiro
    nome_formatado=$(echo "$nome_cru" | tr '[:upper:]' '[:lower:]')

    # 2. Substitui caracteres acentuados comuns por suas versões limpas
    nome_formatado=$(echo "$nome_formatado" | sed '
        s/[áàãâä]/a/g;
        s/[éèêë]/e/g;
        s/[íìîï]/i/g;
        s/[óòõôö]/o/g;
        s/[úùûü]/u/g;
        s/ç/c/g;
    ')

    # 3. Remove qualquer apóstrofo ou aspas que tenham sobrado
    nome_formatado=$(echo "$nome_formatado" | sed "s/['\`]//g")

    # 4. Substitui espaços por underscores (_) e limpa duplicados
    nome_formatado=$(echo "$nome_formatado" | tr -s ' ' '_')

    # Monta o nome final do subpacote (ex: p1164_numero_perfeito)
    sub_pacote="p${id}_${nome_formatado}"

    # Converte os pontos do pacote em barras para criar os diretórios
    caminho_diretorio=$(echo "${PACOTE_BASE}.${sub_pacote}" | tr '.' '/')

    echo "Criando estrutura para: $sub_pacote..."

    # Cria a pasta e todas as pastas pai necessárias
    mkdir -p "$caminho_diretorio"

    # Cria o arquivo Main.java
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

done

echo "Concluído! Agora sim tudo limpo e sem caracteres parasitas."