package beecrowd.iniciante.p4.p1157_divisores_i;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                System.out.println(i);
            }
        }

    }

}
