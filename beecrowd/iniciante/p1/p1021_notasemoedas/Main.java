package beecrowd.iniciante.p1.p1021_notasemoedas;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double m = scanner.nextDouble();
        scanner.close();
        
        // Multiplica por 100 e usa Math.round para evitar perdas na conversão
        // Ex: 576.73 vira 57673 centavos. Usamos long porque o valor pode ser alto.
        long centavos = Math.round(m * 100);
        
        // Calculando as notas (convertidas para centavos)
        int n100 = (int) (centavos / 10000);
        centavos %= 10000;
        
        int n50 = (int) (centavos / 5000);
        centavos %= 5000;
        
        int n20 = (int) (centavos / 2000);
        centavos %= 2000;
        
        int n10 = (int) (centavos / 1000);
        centavos %= 1000;
        
        int n5 = (int) (centavos / 500);
        centavos %= 500;
        
        int n2 = (int) (centavos / 200);
        centavos %= 200;
        
        // Calculando as moedas (em centavos)
        int m1 = (int) (centavos / 100);
        centavos %= 100;
        
        int m05 = (int) (centavos / 50);
        centavos %= 50;
        
        int m025 = (int) (centavos / 25);
        centavos %= 25;
        
        int m010 = (int) (centavos / 10);
        centavos %= 10;
        
        int m005 = (int) (centavos / 5);
        centavos %= 5;
        
        int m001 = (int) centavos; // O que sobrar são as moedas de 1 centavo
        
        // Saída idêntica à solicitada
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m05 + " moeda(s) de R$ 0.50");
        System.out.println(m025 + " moeda(s) de R$ 0.25");
        System.out.println(m010 + " moeda(s) de R$ 0.10");
        System.out.println(m005 + " moeda(s) de R$ 0.05");
        System.out.println(m001 + " moeda(s) de R$ 0.01");
    }
}
