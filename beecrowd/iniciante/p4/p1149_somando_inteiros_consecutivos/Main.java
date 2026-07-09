package beecrowd.iniciante.p4.p1149_somando_inteiros_consecutivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();

        // 1. Lê até obter um N válido
        while (N <= 0) {
            N = sc.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < N; i++) {
            soma += A + i;
        }

        System.out.println(soma);
        sc.close();
    }
}