package beecrowd.iniciante.p3.p1101_seq_nums_e_soma;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0) {
            int sum = 0;

            // Garante que 'm' será menor
            if (m > n) {
                int temp = n;
                n = m;
                m = temp;
            }

            // Imprime a sequência e calcula a soma
            for (int i = m; i <= n; i++) {
                System.out.printf("%d ", i);
                sum += i;
            }
            System.out.printf("Sum=%d%n", sum);

            m = sc.nextInt();
            n = sc.nextInt();
        }

        sc.close();
    }
}