package beecrowd.iniciante.p5.p1864_nossosdiasnuncavoltarao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // Dicionário com as palavras conhecidas em inglês
    private static final Set<String> DICIONARIO = new HashSet<>(Arrays.asList(
            "LIFE", "IS", "NOT", "A", "PROBLEM", "TO", "BE", "SOLVED", "BUT", "REALITY", "EXPERIENCED"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String htmlEntrada = "<p>E aí? Curtiu a Esco<u>l</u>a de <u>I</u>nverno deste ano? Para que esta Escola acontecesse, <u>f</u>oram muitos qu<u>e</u> trabalharam, seja na elaboração dos problemas, na conf<u>i</u>guração do Portal, na logí<u>s</u>tica do eve<u>n</u>t<u>o</u> ou na cap<u>ta</u>ção dos recursos. Nosso agradecimento es<u>p</u>ecial deste ano vai pa<u>r</u>a <u>o</u> Prof. Ricardo Oliveira, que não somente aceitou vir ministrar as oficinas como tam<u>b</u>ém participou ativamente na organização da Esco<u>l</u>a. T<u>em</u>os cer<u>t</u>eza que a experiência e a carreira dele n<u>o</u> ICPC como competidor e como <em>coach</em> motivaram e inspiraram todos nós.</p>\n" +
                "\n" +
                "<p>Esperamos que você tenha gostado desses últimos dias em Essos e em Westeros, que tenha aprendido <u>b</u>astant<u>e</u> e que tenha <u>s</u>e divertid<u>o</u>. Mas não é só em Essos e em Westeros que você deve se divertir. Aqui, em A<u>l</u>ém da Muralha, programar também é di<u>ve</u>rti<u>d</u>o. Continue estudando, continue treinando, e cada vez mais. O importante é o caminho que você vai trilhar daqui para frente. Nosso conselho é que você procure sempre aproveitar ao máximo cada momento, cada oficina, cada escola, cada treino, cada tempo de prática ou estudo em casa. Nossos dias nunca voltarão.</p>";

        // 1. Extrai APENAS as letras contínuas do HTML: "LIFEISNOTAPROBLEM..."
        String letrasPuras = extrairTodasLetras(htmlEntrada);

        // 2. Segmenta a string contínua em palavras usando o dicionário
        String fraseComEspacos = segmentarTexto(letrasPuras);

        // System.out.println("Frase Reconstruída Dinamicamente:");
        // System.out.println(fraseComEspacos);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > 0 && n <= fraseComEspacos.length()) {
                //System.out.println("\nSaída para N = " + n + ":");
                System.out.println(fraseComEspacos.substring(0, n));
            }
        }

        sc.close();
    }

    /**
     * Extrai todas as letras dentro de <u> e junta em uma única string sem espaços.
     */
    private static String extrairTodasLetras(String html) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("<u>(.*?)</u>");
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            sb.append(matcher.group(1));
        }

        return sb.toString().toUpperCase();
    }

    /**
     * Algoritmo de Word Segmentation (Maximal Matching / Algoritmo Guloso)
     * Percorre a string procurando o maior match possível no dicionário.
     */
    private static String segmentarTexto(String texto) {
        StringBuilder resultado = new StringBuilder();
        int inicio = 0;

        while (inicio < texto.length()) {
            boolean encontrouPalavra = false;

            // Tenta encontrar a maior palavra possível a partir da posição atual
            for (int fim = texto.length(); fim > inicio; fim--) {
                String sub = texto.substring(inicio, fim);

                if (DICIONARIO.contains(sub)) {
                    if (resultado.length() > 0) {
                        resultado.append(" ");
                    }
                    resultado.append(sub);
                    inicio = fim; // Avança o ponteiro para o final da palavra encontrada
                    encontrouPalavra = true;
                    break;
                }
            }

            // Fallback de segurança: se não achar no dicionário, avança 1 caractere
            if (!encontrouPalavra) {
                resultado.append(texto.charAt(inicio));
                inicio++;
            }
        }

        return resultado.toString();
    }
}