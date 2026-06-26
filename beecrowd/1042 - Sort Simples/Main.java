import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        // Guardamos os valores originais antes de modificar A, B e C para poder imprimir ao final
        int origA = A;
        int origB = B;
        int origC = C;

        // Variável auxiliar para fazer a troca
        int temp;

        // 1. Garante que A seja menor ou igual a B
        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }

        // 2. Garante que B seja menor ou igual a C
        // (Isso joga o maior valor de todos para a posição C)
        if (B > C) {
            temp = B;
            B = C;
            C = temp;
        }

        // 3. Garante novamente que A seja menor ou igual a B
        // (Caso o novo valor de B que veio de C seja menor que A)
        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }

        // Exibe os números em ordem crescente
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        // Linha em branco exigida pelo problema
        System.out.println();
        
        // Exibe os números na ordem em que foram lidos
        System.out.println(origA);
        System.out.println(origB);
        System.out.println(origC);
    }
}