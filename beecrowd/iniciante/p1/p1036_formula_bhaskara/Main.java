package beecrowd.iniciante.p1.p1036_formula_bhaskara;

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
        
        double delta = Math.pow(B,2)-4*A*C;
        if (delta<=0||A==0){
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n",R1);
            System.out.printf("R2 = %.5f%n",R2);
        }
        
    }
 
}
