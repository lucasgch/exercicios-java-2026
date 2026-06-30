package beecrowd.p1072_intervalo_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0;
        for (int i = 1; i <= n; i++) {
            int entrada = sc.nextInt();
            if (entrada>=10 && entrada<=20){
                in++;
            }
        }
        sc.close();
        System.out.println(in+" in");
        System.out.println(n-in+" out");
    }

}