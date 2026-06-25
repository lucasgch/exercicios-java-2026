import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        
        float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;
        
        System.out.printf("Media: %.1f%n", media);
        
        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0f) {
            System.out.println("Aluno reprovado.");
        } else {
            // Média entre 5.0 e 6.9 inclusivo
            System.out.println("Aluno em exame.");
            
            float exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            
            float mediaFinal = (media + exame) / 2f;
            
            if (mediaFinal >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
        
        sc.close();
    }
}