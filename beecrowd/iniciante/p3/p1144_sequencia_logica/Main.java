package beecrowd.iniciante.p3.p1144_sequencia_logica;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out = 1;
        int out2 = 1;
        int out3 = 1;
        for  (int i = 1; i <= n*2; i++) {
            System.out.printf("%d %d %d%n",out,out2,out3);

            if (i % 2 == 0) {
                out++;
                out2=(int)Math.pow(out,2);
                out3=(int)Math.pow(out,3);
            } else {
                out2++;
                out3++;
            }
        }

        sc.close();

    }

}