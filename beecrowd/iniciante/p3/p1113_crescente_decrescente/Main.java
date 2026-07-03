package beecrowd.iniciante.p3.p1113_crescente_decrescente;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while ( m != n ) {
            String result = n>m?"Crescente":"Decrescente";
            System.out.println(result);
            m = sc.nextInt();
            n = sc.nextInt();
        }
        sc.close();
    }
}