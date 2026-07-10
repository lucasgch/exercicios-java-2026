package beecrowd.iniciante.p4.p1158_soma_de_impares_consecutivos_iii;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            int impares = 0;

            for (int j = x; impares < y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                    impares++;
                }
            }

            System.out.println(soma);
        }

        sc.close();
    }
}