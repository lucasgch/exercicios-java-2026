package beecrowd.iniciante.p5.p1190_area_direita;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new  Scanner(System.in);
        char o = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        double soma = 0.0;
        int contador = 0;

        // Preenche a matriz
        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }

        // Imprime a área direita
        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                if (j>i && i+j>11){
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }

        if (o == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / contador);
        }

    }

}