package beecrowd.iniciante.p5.p1478_matriz_quadrada_ii;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            int n = Integer.parseInt(line);

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valor = Math.abs(i - j) + 1;

                    if (j > 0) {
                        writer.write(" ");
                    }

                    if (valor < 10) {
                        writer.write("  ");
                    } else if (valor < 100) {
                        writer.write(" ");
                    }

                    writer.write(Integer.toString(valor));
                }
                writer.newLine();
            }
            writer.newLine();
        }

        writer.flush();
    }
}