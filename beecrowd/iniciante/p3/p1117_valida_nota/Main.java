package beecrowd.iniciante.p3.p1117_valida_nota;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }
        double nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }
        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f%n", media);
        sc.close();

    }

}