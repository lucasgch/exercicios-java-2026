#!/bin/bash

# Define o pacote base comum a todos os exercícios
PACOTE_BASE="beecrowd.iniciante.p4"

# Lista de exercícios fornecida (ID e Nome)
# Usando heredoc para ler a lista linha por linha
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

    # Extrai o nome do exercício (removendo o ID e espaços extras das pontas)
    nome_cru=$(echo "$linha" | sed -E "s/^$id[[:space:]]+//")

    # Limpa a palavra "Favorite" caso ela exista no final da linha
    nome_cru=$(echo "$nome_cru" | sed -E "s/[[:space:]]+Favorite[[:space:]]*$//")

    # Tratamento de texto para o padrão de pacote Java:
    # 1. Remove acentos (converte Sequência -> Sequencia)
    # 2. Transforma em minúsculas
    # 3. Substitui espaços por underscores (_)
    nome_formatado=$(echo "$nome_cru" | iconv -f UTF-8 -t ASCII//TRANSLIT | tr '[:upper:]' '[:lower:]' | tr -s ' ' '_')

    # Monta o nome final do subpacote (ex: p1145_sequencia_logica_2)
    sub_pacote="p${id}_${nome_formatado}"

    # O caminho do diretório em Java segue a estrutura de pontos convertida em barras
    # Ex: beecrowd/iniciante/p4/p1145_sequencia_logica_2
    caminho_diretorio=$(echo "${PACOTE_BASE}.${sub_pacote}" | tr '.' '/')

    echo "Criando estrutura para: $sub_pacote..."

    # Cria a pasta e todas as pastas pai necessárias (-p)
    mkdir -p "$caminho_diretorio"

    # Cria o arquivo Main.java com o conteúdo dinâmico do pacote
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

echo "Concluído! Todas as pastas e arquivos Main.java foram criados com sucesso."