package beecrowd.p1073_quadrado_pares;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^%d = %d%n",i,2,((int)Math.pow(i,2)));
            }
        }

    }

}
