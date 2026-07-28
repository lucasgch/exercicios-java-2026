package beecrowd.iniciante.p5.p1828_Bazinga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String jogada1 = st.nextToken();
            String jogada2 = st.nextToken();

            String resultado;

            if (jogada1.equals(jogada2)) {
                resultado = "De novo!";
            } else if (sheldonVenceu(jogada1, jogada2)) {
                resultado = "Bazinga!";
            } else {
                resultado = "Raj trapaceou!";
            }

            sb.append("Caso #").append(i).append(": ").append(resultado).append("\n");
        }

        System.out.print(sb);
    }

    private static boolean sheldonVenceu(String j1, String j2) {
        return (j1.equals("tesoura") && (j2.equals("papel") || j2.equals("lagarto"))) ||
                (j1.equals("papel")   && (j2.equals("pedra") || j2.equals("Spock"))) ||
                (j1.equals("pedra")   && (j2.equals("lagarto") || j2.equals("tesoura"))) ||
                (j1.equals("lagarto") && (j2.equals("Spock") || j2.equals("papel"))) ||
                (j1.equals("Spock")   && (j2.equals("tesoura") || j2.equals("pedra")));
    }
}