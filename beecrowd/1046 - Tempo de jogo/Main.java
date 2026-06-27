import java.util.Scanner;
public class Main {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();
        scanner.close();

        
        int duracao;

        if (fim>inicio){
            duracao = fim - inicio;
        } else {
            
            duracao = (24 - inicio) + fim;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)%n",duracao);
        
    }

}