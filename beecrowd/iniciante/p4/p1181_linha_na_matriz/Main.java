package beecrowd.iniciante.p4.p1181_linha_na_matriz;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma=0;

        int linhaDaOpASerRealizada = sc.nextInt();
        char operacao = sc.next().charAt(0);


        double[][] matriz = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
                if (i==linhaDaOpASerRealizada) {
                    soma+=matriz[i][j];
                }
            }
        }

        if (operacao=='S') {
            System.out.printf("%.1f%n",soma);
        } else {
            System.out.printf("%.1f%n",(soma/12.0));
        }

        sc.close();
    }

}
