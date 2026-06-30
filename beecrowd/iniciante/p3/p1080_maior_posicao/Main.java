package beecrowd.iniciante.p3.p1080_maior_posicao;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int posicao = 0;
        for (int i = 1; i <= 100; i++) {
            int numero = sc.nextInt();
            if (numero > maior){
                maior = numero;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();

    }

}
