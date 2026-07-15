package beecrowd.iniciante.p4.p1176_fibonacci_em_vetor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;

        // Preenchemos o vetor fibonaci
        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Leitura com BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Saída com StringBuilder
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            // "Fib(N) = X"
            sb.append("Fib(").append(n).append(") = ").append(fib[n]).append("\n");
        }

        // Imprime todas as respostas de uma vez só
        System.out.print(sb.toString());
    }
}