package beecrowd.iniciante.p6.p1929_triangulo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] numeros =  new int[4];
        String resultado;

        for  (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(numeros);

        if (numeros[2] < numeros[0] + numeros[1] || numeros[3] < numeros[1] + numeros[2]) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }

}
