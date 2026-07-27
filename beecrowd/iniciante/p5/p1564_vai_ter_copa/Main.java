package beecrowd.iniciante.p5.p1564_vai_ter_copa;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }

        scanner.close();

    }

}
