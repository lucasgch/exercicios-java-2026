package beecrowd.iniciante.p2.p1067_numeros_impares;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}
