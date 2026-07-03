package beecrowd.iniciante.p3.p1099_soma_impares_consecutivosII;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for  (int i = 0; i < n; i++) {
            int a =  sc.nextInt();
            int b = sc.nextInt();

            // Garante que a>b
            if (a>b){
                int temp = b;
                b = a;
                a = temp;
            }

            int soma = 0;
            for (int j = a+1; j < b; j++) {
                if (j % 2 != 0) {
                    soma+=j;
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }

}