package beecrowd.iniciante.p3.p1134_tipo_combustivel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tipoCombustivel;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        do {
            tipoCombustivel = leTipo(sc);
            switch (tipoCombustivel) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
            }
        } while (tipoCombustivel!=4);
        sc.close();
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }

    static int leTipo(Scanner sc){
        int tipoCombustivel = 0;
        do {
            tipoCombustivel = sc.nextInt();
        } while (tipoCombustivel < 1 || tipoCombustivel > 4);
        return tipoCombustivel;
    }

}