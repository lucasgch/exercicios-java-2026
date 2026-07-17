package beecrowd.iniciante.p5.p1183_acima_da_diagonal_principal;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new  Scanner(System.in);
        char o = sc.next().charAt(0);

        double[][] matriz = new double[12][12];

        double soma = 0.0;
        int contador = 0;

        for (int i=0; i<12; i++){
            for  (int j=0; j<12; j++){
                matriz[i][j] = sc.nextDouble();

                if (j > i) {
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }
        sc.close();

        if (o == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / contador);
        }

    }

}
