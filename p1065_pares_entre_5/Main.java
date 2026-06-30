package p1065_pares_entre_5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int entrada;
        for (int i = 0; i < 5; i++) {

            entrada = sc.nextInt();
            if (entrada%2==0){
                pares++;
            }

        }
        System.out.printf("%d valores pares%n",pares);
        sc.close();
    }

}
