package beecrowd.p1064_positivos_media;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.US);
       int positivos=0;
       double media = 0.0;
       for (int i=0; i<6; i++){
           double numero = sc.nextDouble();
           if (numero>0.0) {
               positivos++;
               media += numero;
           }
       }
       System.out.println(positivos+" valores positivos");
       System.out.printf("%.1f%n",media/positivos);
       sc.close();

    }

}