package beecrowd.iniciante.p3.p1116_dividindo_x_por_y;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x =  sc.nextInt();
            int y = sc.nextInt();
            if (y==0){
                System.out.println("divisao impossivel");
            }
            else {
                double resultado = (double)x / y;
                System.out.printf("%.1f%n",resultado);
            }
        }

    }

}