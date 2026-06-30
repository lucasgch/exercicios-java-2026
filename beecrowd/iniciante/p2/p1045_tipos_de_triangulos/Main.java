package beecrowd.iniciante.p2.p1045_tipos_de_triangulos;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        scanner.close();

        // Ordenar os valores de forma decrescente        
        float aux;

        // Garante que A seja maior que B
        if (B > A) {
            aux = A; A = B; B = aux;
        }
        // Garante que A seja maior que C (agora A é definitivamente o maior de todos)
        if (C > A) {
            aux = A; A = C; C = aux;
        }
        // Garante que B seja maior que C
        if (C > B) {
            aux = B; B = C; C = aux;
        }

        // Calcular o tipo de triangulo
        
        // A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        if ( A >= (B+C) ) {
            System.out.println("NAO FORMA TRIANGULO");
        
        // A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        } else if ( ( Math.pow(A,2) ) == Math.pow(B,2)+Math.pow(C,2) ) {
            System.out.println("TRIANGULO RETANGULO");

        // A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        } else if ( ( Math.pow(A,2) ) > Math.pow(B,2)+Math.pow(C,2) ) {
            System.out.println("TRIANGULO OBTUSANGULO");

        // A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        } else if ( ( Math.pow(A,2) ) < Math.pow(B,2)+Math.pow(C,2) ){
            System.out.println("TRIANGULO ACUTANGULO");
        } 

        if (A==B && A==C){
             System.out.println("TRIANGULO EQUILATERO");
        } else if (A==B || A==C || B==C){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
 
}
