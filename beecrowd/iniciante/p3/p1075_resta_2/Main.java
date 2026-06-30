package beecrowd.iniciante.p3.p1075_resta_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        for (int i = 1; i <= 10000; i++) {
            if (i % entrada == 2){
                System.out.println(i);
            }
        }
        sc.close();

    }

}