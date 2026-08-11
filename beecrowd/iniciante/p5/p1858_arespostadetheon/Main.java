package beecrowd.iniciante.p5.p1858_arespostadetheon;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int minGolpes = Integer.MAX_VALUE;
        int pessoaEscolhida = 1;

        for (int i = 1; i <= n; i++) {
            int golpes = sc.nextInt();

            // O operador strict `<` garante o desempate pela menor posição
            if (golpes < minGolpes) {
                minGolpes = golpes;
                pessoaEscolhida = i;
            }
        }

        System.out.println(pessoaEscolhida);
        sc.close();
    }
}