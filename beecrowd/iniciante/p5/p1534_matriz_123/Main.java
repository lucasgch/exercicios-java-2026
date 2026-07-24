package beecrowd.iniciante.p5.p1534_matriz_123;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            imprimeMatriz(n);
        }

        sc.close();
    }

    private static void imprimeMatriz(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Diagonal secundária
                if (i + j == n - 1) {
                    System.out.print(2);
                }
                // Diagonal principal
                else if (i == j) {
                    System.out.print(1);
                }
                // Resto
                else {
                    System.out.print(3);
                }
            }
            System.out.println();
        }
    }
}