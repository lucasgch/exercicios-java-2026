package beecrowd.iniciante.p5.p1837_prefacio;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int resto = a % b;

        // Segundo o enunciado o resto sempre deve ser >0
        if (resto < 0) {
            resto += Math.abs(b);
        }

        int q = (a - resto)/b;
        System.out.printf("%d %d%n", q, resto);

    }

}