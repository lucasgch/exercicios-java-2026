package beecrowd.iniciante.p3.p1094_experiencias;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeExperiencias = sc.nextInt();
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < quantidadeDeExperiencias; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);

            switch (tipo) {
                case 'C' -> {
                    coelhos += quantia;
                }
                case 'R' -> {
                    ratos += quantia;
                }
                case 'S' -> {
                    sapos += quantia;
                }
            }
        }
        int total = coelhos+ratos+sapos;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", (double) coelhos / total * 100) + "%");
        System.out.println("Percentual de ratos: " + String.format("%.2f", (double) ratos / total * 100) + "%");
        System.out.println("Percentual de sapos: " + String.format("%.2f", (double) sapos / total * 100) + "%");
        sc.close();

    }

}
