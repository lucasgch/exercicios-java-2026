package beecrowd.iniciante.p6.p1865_mjolnir;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        String name;
        int forca;
        for (int i = 1; i <= c; i++) {
            name = sc.next();
            sc.nextInt();
            if (name.equals("Thor")){
                System.out.println("Y");
            } else{
                System.out.println("N");
            }
        }






    }

}
