package beecrowd.iniciante.p6.p1914_de_quem_e_a_vez;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int qt = sc.nextInt();

        for (int i = 0; i < qt; i++) {
            String jogador1 = sc.next();
            String jogada1 = sc.next();
            String jogador2 = sc.next();
            String jogada2 = sc.next();

            long num1 = sc.nextLong();
            long num2 = sc.nextLong();
            long soma = num1 + num2;

            boolean somaEhPar = (soma % 2 == 0);

            if (somaEhPar) {
                if (jogada1.equals("PAR")) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            } else {
                if (jogada1.equals("IMPAR")) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            }
        }

        sc.close();
    }
}