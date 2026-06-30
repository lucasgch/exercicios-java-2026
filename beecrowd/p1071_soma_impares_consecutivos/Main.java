package beecrowd.p1071_soma_impares_consecutivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        int somaImparesConsecutivos = 0;

        for (int i = a+1; i<b; i++) {
            if ( i % 2 != 0 ) {
                somaImparesConsecutivos += i;
            }
        }

        System.out.println(somaImparesConsecutivos);

    }
}