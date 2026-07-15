package beecrowd.iniciante.p4.p1175_troca_em_vetor_i;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] n = new int[20];
        Scanner sc = new Scanner(System.in);

        // Leitura
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        // Troca
        int[] nt = new int[20];
        for (int i = 0; i < n.length; i++) {
            nt[n.length-i-1]=n[i];
        }

        // Impressão
        for (int i = 0; i < nt.length; i++) {
            System.out.printf("N[%d] = %d%n",i,nt[i]);
        }
    }

}
