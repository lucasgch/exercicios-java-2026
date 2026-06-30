import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Lê data inicial
        String entrada = sc.nextLine();
        String[] entradas = entrada.split(" ");
        int diaInicio = Integer.parseInt(entradas[1]);

        entrada = sc.nextLine();
        entradas = entrada.split(" : ");
        int horaInicio = Integer.parseInt(entradas[0].trim());
        int minutoInicio = Integer.parseInt(entradas[1].trim());
        int segundoInicio = Integer.parseInt(entradas[2].trim());

        // Lê data final
        entrada = sc.nextLine();
        entradas = entrada.split(" ");
        int diaFim = Integer.parseInt(entradas[1]);

        entrada = sc.nextLine();
        entradas = entrada.split(" : ");
        int horaFim = Integer.parseInt(entradas[0].trim());
        int minutoFim = Integer.parseInt(entradas[1].trim());
        int segundoFim = Integer.parseInt(entradas[2].trim());

        sc.close();

        // 1. Converte tudo para segundos totais
        // Multiplicamos o dia por 86400 (segundos em um dia), hora por 3600 e minuto por 60
        long inicioEmSegundos = (diaInicio * 86400L) + (horaInicio * 3600L) + (minutoInicio * 60L) + segundoInicio;
        long fimEmSegundos = (diaFim * 86400L) + (horaFim * 3600L) + (minutoFim * 60L) + segundoFim;

        // 2. Calcula a diferença total em segundos
        long diferencaSegundos = fimEmSegundos - inicioEmSegundos;

        // 3. Transforma de volta para Dias, Horas, Minutos e Segundos usando divisões e restos (%)
        long difDias = diferencaSegundos / 86400;
        diferencaSegundos %= 86400; // O que sobrou vira horas

        long difHoras = diferencaSegundos / 3600;
        diferencaSegundos %= 3600; // O que sobrou vira minutos

        long difMinutos = diferencaSegundos / 60;
        long difSegundos = diferencaSegundos % 60; // O resto final são os segundos

        // Exibe o resultado no formato esperado
        System.out.printf("%d dia(s)%n", difDias);
        System.out.printf("%d hora(s)%n", difHoras);
        System.out.printf("%d minuto(s)%n", difMinutos);
        System.out.printf("%d segundo(s)%n", difSegundos);
    }
}