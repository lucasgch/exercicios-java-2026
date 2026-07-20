#!/bin/bash

# Define o pacote base comum a todos os exercícios (Ajustado para p5)
PACOTE_BASE="beecrowd.iniciante.p5"

# Lista de exercícios fornecida (ID e Nome) - Página 5 do Beecrowd
exercicios=$(cat << 'EOF'
1182   Coluna na Matriz   Favorite
1183   Acima da Diagonal Principal   Favorite
1184   Abaixo da Diagonal Principal   Favorite
1185   Acima da Diagonal Secundária   Favorite
1186   Abaixo da Diagonal Secundária   Favorite
1187   Área Superior   Favorite
1188   Área Inferior   Favorite
1189   Área Esquerda   Favorite
1190   Área Direita   Favorite
1435   Matriz Quadrada I   Favorite
1478   Matriz Quadrada II   Favorite
1534   Matriz 123   Favorite
1541   Construindo Casas   Favorite
1557   Matriz Quadrada III   Favorite
1564   Vai Ter Copa?   Favorite
1589   Bob Conduite   Favorite
1759   Ho Ho Ho   Favorite
1789   A Corrida de Lesmas   Favorite
1827   Matriz Quadrada IV   Favorite
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

    # Monta o nome final do subpacote (ex: p1182_coluna_na_matriz)
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

echo "Concluído! Pasta 'p5' gerada com sucesso."