package beecrowd.iniciante.p4.p1146_sequencias_crescentes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue;

            int entrada = Integer.parseInt(st.nextToken());

            // Exit condition
            if (entrada == 0) {
                break;
            }

            imprimeSequencia(entrada);
        }
    }

    static void imprimeSequencia(int n) {
        // StringBuilder accumulates text in memory, avoiding repeated slow I/O calls
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                sb.append(i).append("\n");
            } else {
                sb.append(i).append(" ");
            }
        }

        // A single print call per sequence
        System.out.print(sb.toString());
    }
}