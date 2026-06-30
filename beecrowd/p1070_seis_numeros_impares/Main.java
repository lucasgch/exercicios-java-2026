package beecrowd.p1070_seis_numeros_impares;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int impares = 0;
        while (impares < 6){
            if (n % 2 != 0){
                System.out.println(n);
                impares++;
                n+=2;
            } else{
                n++;
            }
        }

    }

}
