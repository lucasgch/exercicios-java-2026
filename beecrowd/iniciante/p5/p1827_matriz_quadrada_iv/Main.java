package beecrowd.iniciante.p5.p1827_matriz_quadrada_iv;

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

            imprimeMatriz(n);

        }

        sc.close();

    }

    /**
     * Parte externa é preenchida com 0
     * Parte interna é preenchida com 1
     * Diagonal principal é preenchida com 2
     * Diagonal secundária é preenchida com 3
     * Ponto central contém o valor 4
     *
     * Obs: o quadrado com '1' sempre começa na posição tamanho/3, tanto na largura quanto quanto na altura. A linha e a coluna começam em zero (0).
     * @param n
     */
    public static void imprimeMatriz(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 && j == n / 2) {
                    sb.append('4');
                } else if (i >= n / 3 && i < n - (n / 3) && j >= n / 3 && j < n - (n / 3)) {
                    sb.append('1');
                } else if (j == i) {
                    sb.append('2');
                } else if (j + i == n - 1) {
                    sb.append('3');
                } else {
                    sb.append('0');
                }
            }
            sb.append('\n'); // Nova linha da matriz
        }

        System.out.print(sb.toString()); // Imprime a matriz inteira acumulada de uma só vez
        System.out.println();
    }

}
