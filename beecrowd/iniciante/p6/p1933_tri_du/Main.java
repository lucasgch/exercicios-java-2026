package beecrowd.iniciante.p6.p1933_tri_du;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Um trio (três cartas de mesmo valor) ganha de uma dupla (duas cartas de mesmo valor).
         * Um trio formado por cartas de maior valor ganha de um trio formado por cartas de menor valor.
         * Uma dupla formada por cartas de maior valor ganha de uma dupla formada por cartas de menor valor.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a==b){
            System.out.println(a);
        } else if (a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

}
