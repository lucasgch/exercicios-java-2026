package beecrowd.iniciante.p3.p1131_grenais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int novosGrenais = 0;
        int empate = 0;
        int gremio = 0;
        int inter = 0;
        int grenais = 0;
        do {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();
            grenais++;
            if (golsInter==golsGremio){
                empate++;
            } else if (golsInter>golsGremio){
                inter++;
            } else {
                gremio++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            novosGrenais = sc.nextInt();
        } while ( novosGrenais==1 );
        System.out.println(grenais+" grenais");
        System.out.println("Inter:"+inter);
        System.out.println("Gremio:"+gremio);
        System.out.println("Empates:"+empate);
        if (inter>gremio){
            System.out.println("Inter venceu mais");
        } else if (gremio>inter){
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }

}