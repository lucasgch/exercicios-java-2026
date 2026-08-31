package beecrowd.iniciante.p6.p1961_pula_sapo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int alturaDoPulo = sc.nextInt();
        int numeroDeCanos = sc.nextInt();

        // Guarda o primeiro cano como ponto de partida
        int canoAnterior = sc.nextInt();
        boolean conseguiuVencer = true;

        for (int i = 1; i < numeroDeCanos; i++) {
            int canoAtual = sc.nextInt();

            // Verifica a diferença absoluta de altura (seja subindo ou descendo)
            if (Math.abs(canoAtual - canoAnterior) > alturaDoPulo) {
                conseguiuVencer = false;
                break;
            }

            // Atualiza o cano onde o sapo está no momento
            canoAnterior = canoAtual;
        }

        if (conseguiuVencer) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }

        sc.close();
    }
}