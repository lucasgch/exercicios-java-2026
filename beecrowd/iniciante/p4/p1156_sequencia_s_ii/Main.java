package beecrowd.iniciante.p4.p1156_sequencia_s_ii;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        double soma = 1;
        double denominador = 2;
        for (int i = 3; i <= 39; i+=2) {
            soma += (i / denominador);
            denominador *= 2.0;
        }
        System.out.printf("%.2f%n",soma);
    }
}
