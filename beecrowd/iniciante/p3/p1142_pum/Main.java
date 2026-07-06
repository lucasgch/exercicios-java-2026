package beecrowd.iniciante.p3.p1142_pum;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int np = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(np+" ");
                np++;
            }
            np++;
            System.out.println("PUM");
        }

    }

}