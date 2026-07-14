package beecrowd.iniciante.p4.p1173_preenchimento_de_vetor_i;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] V = new int[10];
        V[0] = sc.nextInt();
        for  (int i = 1; i < V.length; i++) {
            V[i] = V[i-1]*2;
        }

        for  (int i = 0; i < V.length; i++) {
            System.out.printf("N[%d] = %d%n", i, V[i]);
        }

    }

}
