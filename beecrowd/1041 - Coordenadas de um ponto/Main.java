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
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        scanner.close();
        
        if (x==0 || y==0){
            if (x==0 && y==0){
                System.out.println("Origem");
            } else if (x==0){
                System.out.println("Eixo Y");
            } else {
                System.out.println("Eixo X");
            }
            
        } else if (x>0){
            if (y>0){
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else {
            if (y>0){
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }
    }
}