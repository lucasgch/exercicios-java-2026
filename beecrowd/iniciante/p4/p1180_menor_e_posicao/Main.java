package beecrowd.iniciante.p4.p1180_menor_e_posicao;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int menorValor = Integer.MAX_VALUE;
        int posicaoMenorValor = 0;
        for (int i = 0; i <= vetor.length-1; i++) {
            vetor[i] = sc.nextInt();
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicaoMenorValor = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenorValor);
    }

}
