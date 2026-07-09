package beecrowd.iniciante.p4.p1150_ultrapassando_z;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int Z = X;

        // Z deve ser maior que X
        while (Z <= X) {
            Z = sc.nextInt();
        }

        // Começa em 1 porque o próprio X já está na soma
        int contagem = 1;
        int soma = X;

        // Variável auxiliar: próximos números (X + 1, X + 2...)
        int proximoNumero = X + 1;

        while (soma <= Z) {
            soma += proximoNumero;
            proximoNumero++;
            contagem++;
        }

        System.out.println(contagem);
        sc.close();
    }
}