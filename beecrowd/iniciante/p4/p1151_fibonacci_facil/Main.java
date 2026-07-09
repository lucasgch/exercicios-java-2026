package beecrowd.iniciante.p4.p1151_fibonacci_facil;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(n1);
            } else {
                System.out.print(n1 + " ");
            }

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }

        System.out.println();
    }
}