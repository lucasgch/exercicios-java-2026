package beecrowd.iniciante.p6.p1958_notacao_cientifica;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // Define o Locale para US para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String entrada = sc.next();
        double x = Double.parseDouble(entrada);
        String resultado = String.format(Locale.US, "%.4E", x);

        // Se inicia com '-', o sinal DEVE ser '-'
        if (entrada.startsWith("-")) {
            if (!resultado.startsWith("-")) {
                resultado = "-" + resultado;
            }
        } else {
            // Caso contrário, deve ter '+'
            if (!resultado.startsWith("+")) {
                resultado = "+" + resultado;
            }
        }

        System.out.println(resultado);

        sc.close();
    }
}