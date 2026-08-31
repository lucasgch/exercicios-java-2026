package beecrowd.iniciante.p6.p1959_poligonos_regulares_simples;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long l = sc.nextInt();
        sc.close();
        long x = n*l;
        System.out.println(x);

    }

}
