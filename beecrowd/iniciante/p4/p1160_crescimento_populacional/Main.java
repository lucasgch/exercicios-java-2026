package beecrowd.iniciante.p4.p1160_crescimento_populacional;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int PA = sc.nextInt();
            int PB = sc.nextInt();
            double G1 = sc.nextDouble();
            double G2 = sc.nextDouble();

            int anos = 0;

            while (PA <= PB) {

                PA += (int) (PA * (G1 / 100));
                PB += (int) (PB * (G2 / 100));
                anos++;

                if (anos > 100) {
                    break;
                }
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }

        sc.close();
    }
}