package beecrowd.iniciante.p3.p1097_sequencia_ij3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int j = 7;
        for (int i = 1; i <= 9; i+=2){

                for (int r = 0; r<3; r++){
                    System.out.printf("I=%d J=%d%n",i, j);
                    j--;
                }
                j+=5;

        }

    }

}