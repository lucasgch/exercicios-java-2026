package beecrowd.iniciante.p6.p1866_conta;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.close();
        int soma = 0;
        for (int i = 1; i <= c; i++) {
            int termos = sc.nextInt();
            for (int j = 1; j <= termos; j++) {
                if (j % 2 != 0) {
                    soma++;
                } else {
                    soma--;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }

}
