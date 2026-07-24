package beecrowd.iniciante.p5.p1534_matriz_123;

import java.io.IOException;
import java.util.Scanner;

/**

* Prioridade 2: Esta posição está na diagonal secundária? Se sim, coloque 2.
* Padrão: Se não for nenhuma das diagonais, coloque 3.
*/
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n>=3 && n<=70){

            imprimeMatriz(n);

            n = sc.nextInt();
        }

    }

    private static void imprimeMatriz(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Se diagonal principal: 1.
                if (i==j){
                    System.out.print(1);
                }
                // Se diagonal secundária: 2.
                else if (i + j == n - 1){
                    System.out.print(2);
                }
                // Senão: 3.
                else {
                    System.out.print(3);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
