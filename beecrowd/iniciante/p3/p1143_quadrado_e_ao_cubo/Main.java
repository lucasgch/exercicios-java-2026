package beecrowd.iniciante.p3.p1143_quadrado_e_ao_cubo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Calcula o quadrado e o cubo
            int quadrado = i * i;
            int cubo = i * i * i;

            // Imprime com espaços entre, mas SEM espaço depois do cubo
            System.out.printf("%d %d %d\n", i, quadrado, cubo);
        }

        sc.close();
    }
}