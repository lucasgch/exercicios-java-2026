package beecrowd.iniciante.p4.p1172_substituicao_em_vetor_i;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i<x.length; i++){
            x[i] = sc.nextInt();
            if (x[i] ==0 || x[i]<0){
                x[i] = 1;
            }
        }

        for (int i = 0; i<x.length; i++){
            System.out.printf("X[%d] = %d%n",i,x[i]);
        }

    }

}
