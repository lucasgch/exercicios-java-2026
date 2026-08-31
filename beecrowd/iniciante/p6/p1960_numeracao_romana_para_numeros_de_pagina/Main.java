package beecrowd.iniciante.p6.p1960_numeracao_romana_para_numeros_de_pagina;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // Mapeamento dos valores arábicos para os numerais romanos
        int[] valores = {900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        StringBuilder sb = new StringBuilder();
        // Converte o número arábico para romano
        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                sb.append(simbolos[i]);
                // Desconta o valor do símbolo concatenado do total e reinicia o cálculo
                n -= valores[i];
            }
        }

        System.out.println(sb.toString());

    }

}
