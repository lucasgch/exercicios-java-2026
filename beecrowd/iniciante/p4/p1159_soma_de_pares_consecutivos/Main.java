package beecrowd.iniciante.p4.p1159_soma_de_pares_consecutivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x!=0){

            if (x%2!=0){
                x++;
            }
            int cont = 0;
            int soma = 0;
            for (int i = x; cont<5; i+=2) {
                soma+=i;
                cont++;
            }
            System.out.println(soma);
            x = sc.nextInt();
        }

        sc.close();
    }

}
