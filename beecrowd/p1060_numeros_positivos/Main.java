package beecrowd.p1060_numeros_positivos;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        for (int i = 1; i <= 6; i++) {
            double valor1 = sc.nextDouble();
            if (valor1 > 0) {
                positivos++;
            }
        }

        sc.close();
        System.out.printf("%d valores positivos%n",positivos);
    }
}
