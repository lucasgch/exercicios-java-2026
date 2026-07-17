package beecrowd.iniciante.p5.p1182_coluna_na_matriz;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        char t = sc.next().charAt(0);

        double[][] matriz = new double[12][12];

        double soma = 0.0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
                if (j==c){
                    soma += matriz[i][j];
                }
            }
        }
        sc.close();

        if (t == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / 12.0);
        }

    }

}
