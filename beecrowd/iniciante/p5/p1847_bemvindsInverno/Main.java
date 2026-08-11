package beecrowd.iniciante.p5.p1847_bemvindsInverno;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        //Se a temperatura permaneceu constante do 1º para o 2º dia.
        if (a == b ) {
            // As pessoas ficam felizes se subiu do 2º para o 3º dia
            if (c>b){
                System.out.println(":)");
            // ou tristes caso contrário (respectivamente, sétima e oitava figuras)
            } else {
                System.out.println(":(");
            }
        // Se a temperatura subiu do 1º para o 2º dia
        } else if (b>a){
            // e subiu do 3º para o 2º
            if (c>b) {
                // mas subiu do 2º para o 3º menos do que subira do 1º para o 2º
                if (c-b<b-a) {
                    System.out.println(":(");
                } else {
                    System.out.println(":)");
                }
            // mas desceu ou permaneceu constante do 2º para o 3º, as pessoas ficam tristes (segunda figura)
            } else {
                System.out.println(":(");
            }
        // Se a temperatura desceu do 1º para o 2º dia
        } else {
            // mas subiu ou permaneceu constante do 2º para o 3º
            if (c>=b){
                System.out.println(":)");
            } else {
                if (b-c<a-b){
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            }
        }
    }

}