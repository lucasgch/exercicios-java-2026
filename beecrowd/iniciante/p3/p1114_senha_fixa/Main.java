package beecrowd.iniciante.p3.p1114_senha_fixa;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        final int SENHACORRETA = 2002;
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while (senha!=SENHACORRETA) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        sc.close();
        System.out.println("Acesso Permitido");
    }

}