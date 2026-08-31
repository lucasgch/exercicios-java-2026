package beecrowd.iniciante.p6.p1962_ha_muito_muito_tempo_atras;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = reader.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        int n = Integer.parseInt(line.trim());

        for (int i = 0; i < n; i++) {
            long t = Long.parseLong(reader.readLine().trim());

            if (t < 2015) {
                long ano = 2015 - t;
                sb.append(ano).append(" D.C.\n");
            } else {
                long ano = t - 2015 + 1;
                sb.append(ano).append(" A.C.\n");
            }
        }

        System.out.print(sb);
    }
}