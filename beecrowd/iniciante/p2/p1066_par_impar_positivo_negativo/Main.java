package beecrowd.iniciante.p2.p1066_par_impar_positivo_negativo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int entrada;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        for (int i = 1; i <= 5; i++) {
            entrada = sc.nextInt();
            if (entrada % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (entrada > 0) {
                positivos++;
            } else if (entrada < 0) {
                negativos++;
            }
        }
        sc.close();
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }

}
