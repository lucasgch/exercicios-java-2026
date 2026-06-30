package beecrowd.iniciante.p2.p1047_tempo_de_jogo_com_minutos;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int horaInicio = scanner.nextInt();
        int minutosInicio = scanner.nextInt();
        int horaFim = scanner.nextInt();
        int minutosFim = scanner.nextInt();
        scanner.close();
        
        minutosInicio=horaInicio*60+minutosInicio;

        minutosFim=horaFim*60+minutosFim;

        int duracao;

        if (minutosFim>minutosInicio){
            duracao = minutosFim - minutosInicio;
        } else {
            
            duracao = (1440 - minutosInicio) + minutosFim;
        }

        int duracaoHoras = duracao/60;
        duracao = duracao%60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",duracaoHoras,duracao);
        
    }
    
}
