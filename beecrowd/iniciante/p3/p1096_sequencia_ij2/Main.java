package beecrowd.iniciante.p3.p1096_sequencia_ij2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        for (int i = 1; i <= 9; i+=2){
            for (int j =7; j >=5; j--){
                System.out.printf("I=%d J=%d%n",i,j);
            }
        }

    }

}