package beecrowd.p1051_imposto_de_renda;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double salario = scanner.nextDouble();
        scanner.close();
        
        double imposto;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            imposto = Math.max(0, salario - 2000) * 0.08 // primeira faixa 8%
                           + Math.max(0, salario - 3000) * 0.10 // 8+10=18%
                           + Math.max(0, salario - 4500) * 0.10; // 8+10+10=28%

            System.out.printf(Locale.US, "R$ %.2f%n", imposto);
        }

    }
}
