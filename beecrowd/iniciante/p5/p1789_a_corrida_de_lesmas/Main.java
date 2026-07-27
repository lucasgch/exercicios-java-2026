package beecrowd.iniciante.p5.p1789_a_corrida_de_lesmas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            int maior = 0;
            for  (int i = 1; i <= n; i++) {
                int velocidade = scanner.nextInt();
                if (velocidade < 10){
                    if (1>maior){
                        maior = 1;
                    }
                } else if (velocidade < 20){
                    if (2>maior){
                        maior = 2;
                    }
                } else {
                    if (3>maior){
                        maior = 3;
                    }
                }
            }
            System.out.println(maior);
        }

        scanner.close();

    }

}
