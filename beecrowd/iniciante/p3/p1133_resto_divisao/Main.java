package beecrowd.iniciante.p3.p1133_resto_divisao;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n1 =  sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        int temp = 0;

        // garante que n1 é menor ou igual
        if (n1>n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for (int i = n1+1; i < n2; i++) {
            if ( i % 5 == 2 || i % 5 == 3 ) {
                System.out.println(i);
            }
        }

    }

}