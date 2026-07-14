package beecrowd.iniciante.p4.p1165_numero_primo;

import java.io.IOException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            boolean isPrimo = true;
            int x = sc.nextInt();
            for (int j = 2; j <= x-1; j++) {

                if (x % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            System.out.println(isPrimo ? x + " eh primo" : x + " nao eh primo");
        }

        sc.close();


    }

}
