package beecrowd.iniciante.p4.p1154_idades;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double media = 0;
        int idade = sc.nextInt();
        int contador = 0;
        while(idade >= 0){
            media+=idade;
            idade = sc.nextInt();
            contador++;
        }
        media = media/contador;
        System.out.printf("%.2f%n",media);

    }

}
