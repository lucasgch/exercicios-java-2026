package beecrowd.iniciante.p4.p1145_sequencia_logica_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= b; i++) {
            if (i % a == 0){
                System.out.print(i);
                System.out.println();
                continue;
            }
            System.out.print(i+" ");
        }

    }

}