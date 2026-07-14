package beecrowd.iniciante.p4.p1164_numero_perfeito;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int x = sc.nextInt();
            int soma = 0;

            for (int j = 1; j <= x-1; j++) {
                if (x%j==0) {
                    soma+=j;
                }
            }
            System.out.print(x);
            if (soma==x){
                System.out.println(" eh perfeito");
            } else {
                System.out.println(" nao eh perfeito");
            }

        }
        sc.close();
    }


}
