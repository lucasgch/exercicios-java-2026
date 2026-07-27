package beecrowd.iniciante.p5.p1557_matriz_quadrada_iii;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int[][] matriz = new int[n][n];

            // Potências de 2 (2^(i+j))
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = (int) Math.pow(2, i + j);
                }
            }

            imprimeMatriz(matriz);
            System.out.println(); // Linha em branco entre os casos de teste
        }

        sc.close();
    }

    public static void imprimeMatriz(int[][] matriz) {
        int n = matriz.length;

        // O maior elemento da matriz fica na última posição [n-1][n-1]
        int maiorValor = matriz[n - 1][n - 1];

        // Calcula a quantidade de dígitos T do maior valor
        int t = String.valueOf(maiorValor).length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    // Primeiro elemento da linha (sem espaço na frente)
                    System.out.printf("%" + t + "d", matriz[i][j]);
                } else {
                    // Demais elementos com um espaço antes
                    System.out.printf(" %" + t + "d", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}