package beecrowd.iniciante.p6.p1957_converter_para_hexadecimal;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long resto = 0;
        StringBuilder hex = new StringBuilder();

        do {
            resto = n%16;
            n = n/16;
            if (resto<=9){
                hex.append(resto);
            } else {
                char resultado = switch ((int) resto){
                    case 10 -> 'A';
                    case 11 -> 'B';
                    case 12 -> 'C';
                    case 13 -> 'D';
                    case 14 -> 'E';
                    case 15 -> 'F';
                    default -> throw new IllegalStateException("Unexpected value: " + resto);
                };
                hex.append(resultado);
            }
        } while (n>0);
        System.out.println(hex.reverse());

    }

}
