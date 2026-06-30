package beecrowd.iniciante.p1.p1037_intervalo;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        scanner.close();
        
        // Verifica primeiro se está dentro do limite global
        if (x >= 0 && x <= 100) {
            if (x <= 25) {
                System.out.println("Intervalo [0,25]");
            } 
            else if (x <= 50) { // Garante que é maior que 25 e menor/igual a 50
                System.out.println("Intervalo (25,50]");
            } 
            else if (x <= 75) { // Garante que é maior que 50 e menor/igual a 75
                System.out.println("Intervalo (50,75]");
            } 
            else { // Se não entrou nos anteriores e está no limite global, só pode ser (75,100]
                System.out.println("Intervalo (75,100]");
            }
        } 
        else {
            System.out.println("Fora de intervalo");
        }
    }
}
