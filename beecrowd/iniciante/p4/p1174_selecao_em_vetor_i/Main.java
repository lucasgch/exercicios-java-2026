package beecrowd.iniciante.p4.p1174_selecao_em_vetor_i;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double[] vetor = new double[1];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextDouble();
        }
        input.close();

        for  (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10) {
                System.out.printf("A[%d] = %.1f%n",i,vetor[i]);
            }
        }


    }

}
