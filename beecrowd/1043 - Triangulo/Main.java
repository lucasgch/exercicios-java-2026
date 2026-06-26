import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
            
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        scanner.close();
 
        // Condição: soma de dois lados SEMPRE maior que o terceiro
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
 
    }
 
}