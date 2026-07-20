package beecrowd.iniciante.p5.p1435_matriz_quadrada_i;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            // Condição de parada: N = 0
            if (n == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int dist_topo = i;
                    int dist_fundo = n - 1 - i;
                    int dist_esq = j;
                    int dist_dir = n - 1 - j;

                    int valor = Math.min(Math.min(dist_topo, dist_fundo), Math.min(dist_esq, dist_dir)) + 1;

                    // Pegadinha do beecrowd
                    // Se for a primeira coluna da linha, coloca 3 espaços (%3d)
                    // Para as demais colunas, coloca um espaço extra antes (%4d)
                    if (j == 0) {
                        sb.append(String.format("%3d", valor));
                    } else {
                        sb.append(String.format(" %3d", valor));
                    }
                }
                sb.append("\n");
            }

            sb.append("\n");

            // Imprime o resultado acumulado desta matriz
            System.out.print(sb.toString());
        }

        sc.close();
    }
}