package beecrowd.iniciante.p4.p1153_fatorial_simples;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);

    }

}
