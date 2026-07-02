package beecrowd.iniciante.p3.p1095_sequencia_ij1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int i = 1;
        for (int j = 60; j >= 0; j-=5){
            System.out.printf("I=%d J=%d%n",i,j);
            i+=3;
        }

    }

}