package beecrowd.iniciante.p4.p1178_preenchimento_de_vetor_iii;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double[] x = new double[100];

        x[0] = sc.nextDouble();
        sc.close();

        for  (int i = 1; i < x.length; i++) {
            x[i] = x[i-1]/2;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x.length -1; i++) {
            sb.append("N[").append(i).append("] = ").append(String.format("%.4f", x[i])).append("\n");
        }

        System.out.print(sb.toString());
    }

}
