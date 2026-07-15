package beecrowd.iniciante.p4.p1177_preenchimento_de_vetor_ii;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] v = new int[1000];
        int atual = 0;

        for (int i = 0; i < v.length; i++) {

            if ( atual < t ){
                v[i] = atual;
                atual++;
            } else {
                atual = 1;
            }

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < v.length; i++) {
            int n = v[i];
            // "Fib(N) = X"
            sb.append("N[").append(i).append("] = ").append(n).append("\n");
        }

        System.out.print(sb.toString());

    }

}
