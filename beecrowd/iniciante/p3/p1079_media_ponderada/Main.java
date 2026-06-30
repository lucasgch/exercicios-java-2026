package beecrowd.iniciante.p3.p1079_media_ponderada;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float media = (2*a + 3*b + 5*c) / 10f;
            System.out.printf("%.1f%n", media);
        }
        sc.close();

    }

}
