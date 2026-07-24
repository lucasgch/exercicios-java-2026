package beecrowd.iniciante.p5.p1541_construindo_casas;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int a = sc.nextInt();

            if (a == 0) {
                break;
            }

            int b = sc.nextInt();
            int c = sc.nextInt();

            int areaCasa = a * b;

            int areaTerreno = (areaCasa * 100) / c;

            int lado = (int) sqrt(areaTerreno);

            System.out.println(lado);
        }

        sc.close();
    }
}