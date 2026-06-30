package beecrowd.iniciante.p2.p1038_lanche;

import java.util.Scanner;

public class Main{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int valorUnitario = sc.nextInt();
        sc.close();

        double total = switch(codigo){
            case 1 -> (valorUnitario*4.0);
            case 2 -> (valorUnitario*4.5);
            case 3 -> (valorUnitario*5.0);
            case 4 -> (valorUnitario*2.0);
            case 5 -> (valorUnitario*1.5);
            default -> 0;
        };

        System.out.printf("Total: R$ %.2f%n",total);
    }
}
