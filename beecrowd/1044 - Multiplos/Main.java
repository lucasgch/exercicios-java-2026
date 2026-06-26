import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        boolean multiplos;

        if (A>=B){
            multiplos = A%B==0;
        } else {
            multiplos = B%A==0;
        }

        if (multiplos){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
 
    }
 
}