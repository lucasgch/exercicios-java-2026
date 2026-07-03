package beecrowd.iniciante.p3.p1098_sequencia_ij4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Para evitar erro de imprecisão em ponto flutuante
        // Multiplicamos tudo por 10: i vai de 0 até 20, andando de 2 em 2
        for (int i = 0; i <= 20; i += 2) {
            for (int r = 1; r <= 3; r++) {

                // Calculamos o valor real dividindo por 10.0 (float)
                float valorI = i / 10.0f;
                float valorJ = valorI + r;

                // Se o resto da divisão por 10 for 0, significa que é um número inteiro (ex: 0, 10, 20)
                if (i % 10 == 0) {
                    System.out.printf("I=%.0f J=%.0f%n", valorI, valorJ);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", valorI, valorJ);
                }
            }
        }
    }
}