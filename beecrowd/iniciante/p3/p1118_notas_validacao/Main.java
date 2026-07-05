package beecrowd.iniciante.p3.p1118_notas_validacao;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1. Criamos o Scanner ÚNICO aqui
        Scanner sc = new Scanner(System.in);
        int novoCalculo = 1;

        while (novoCalculo != 2) {
            if (novoCalculo == 1) {
                // 2. Passamos o Scanner como argumento para a função
                double resultado = media(sc);
                System.out.printf("media = %.2f%n", resultado);
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = sc.nextInt();
            } else {
                // Caso o usuário digite algo diferente de 1 ou 2,
                // precisamos continuar perguntando para não gerar loop infinito
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = sc.nextInt();
            }
        }

        sc.close(); // Boa prática fechar no final do programa
    }

    // 3. O método agora recebe o Scanner pronto
    static double media(Scanner sc) {

        double nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }

        double nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }

        return (nota1 + nota2) / 2;
    }
}