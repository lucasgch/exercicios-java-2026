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
        
        double imposto = 0.0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
            return; // Se menor que 2mil, imprime e encerra
        } 
        
        // Se maior que 2000.00
        if (salario > 4500.00) {
            // 28% sobre o que passa de 4500
            imposto += (salario - 4500.00) * 0.28;
            // +18% sobre a faixa inteira de 3000 a 4500
            imposto += 1500.00 * 0.18;
            // +8% sobre a faixa inteira de 2000 a 3000
            imposto += 1000.00 * 0.08;
        } 
        else if (salario > 3000.00) {
            // 18% sobre o que passa de 3000
            imposto += (salario - 3000.00) * 0.18;
            // +8% sobre a faixa inteira de 2000 a 3000
            imposto += 1000.00 * 0.08;
        } 
        else {
            // 8% sobre o que passa de 2000
            imposto += (salario - 2000.00) * 0.08;
        }

        System.out.printf(Locale.US, "R$ %.2f%n", imposto);
    }
}