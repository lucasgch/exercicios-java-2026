package beecrowd.iniciante.p6.p1930_tomadas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();

        int soma = (t1-1)+(t2-1)+(t3-1)+t4;

        System.out.println(soma);

        sc.close();

    }

}
