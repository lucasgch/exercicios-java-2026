package beecrowd.iniciante.p3.p1074_par_ou_impar;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        for (int i = 1; i <= entrada; i++) {
            int numero = sc.nextInt();
            if (numero==0){
                System.out.println("NULL");
            } else if (numero % 2 == 0) {
                System.out.print("EVEN ");
                if (numero>0){
                    System.out.printf("POSITIVE%n");
                } else {
                    System.out.printf("NEGATIVE%n");
                }
            } else {
                System.out.print("ODD ");
                if (numero>0){
                    System.out.printf("POSITIVE%n");
                } else {
                    System.out.printf("NEGATIVE%n");
                }
            }
            sc.close();
        }

    }

}
