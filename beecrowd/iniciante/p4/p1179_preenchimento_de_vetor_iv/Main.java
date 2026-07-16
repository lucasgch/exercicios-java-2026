package beecrowd.iniciante.p4.p1179_preenchimento_de_vetor_iv;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] pares = new int[5];
        int[] impares = new int[5];

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < 15; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                pares[qtdPares] = x;
                qtdPares++;

                if (qtdPares == 5) {
                    imprimeVetor(pares, qtdPares, "par");
                    qtdPares = 0; // Reseta o contador para reutilizar o vetor
                }
            } else {
                impares[qtdImpares] = x;
                qtdImpares++;

                if (qtdImpares == 5) {
                    imprimeVetor(impares, qtdImpares, "impar");
                    qtdImpares = 0; // Reseta o contador para reutilizar o vetor
                }
            }
        }

        if (qtdImpares > 0) {
            imprimeVetor(impares, qtdImpares, "impar");
        }
        if (qtdPares > 0) {
            imprimeVetor(pares, qtdPares, "par");
        }

        sc.close();
    }

    private static void imprimeVetor(int[] vetor, int quantidade, String nomeVetor) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(nomeVetor + "[" + i + "] = " + vetor[i]);
        }
    }
}