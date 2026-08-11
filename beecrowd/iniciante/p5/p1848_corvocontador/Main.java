package beecrowd.iniciante.p5.p1848_corvocontador;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int cawTree = 1;
        int soma = 0;
        while (cawTree <= 3 && sc.hasNextLine()) {
            String entrada = sc.nextLine().trim();
            if (entrada.equals("caw caw")) {
                System.out.println(soma);
                soma = 0; // zera para o próximo número
                cawTree++;
            } else {
                String binario = entrada.replace('*', '1').replace('-', '0');
                soma += Integer.parseInt(binario, 2);

            }
        }
        sc.close();
    }
}