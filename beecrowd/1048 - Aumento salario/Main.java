import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
     
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double salario = scanner.nextDouble();
        scanner.close();
        double reajuste = 0;
        int percentual = 0;
        if (salario<=0){
            
        } else if (salario<=400.0){
            percentual = 15;
            reajuste = (percentual/100.0)*salario;
        } else if (salario<=800.0){
            percentual = 12;
            reajuste = (percentual/100.0)*salario;
        } else if (salario<=1200.0){
            percentual = 10;
            reajuste = (percentual/100.0)*salario;
        } else if (salario<=2000.0){
            percentual = 7;
            reajuste = (percentual/100.0)*salario;
        } else {
            percentual = 4;
            reajuste = (percentual/100.0)*salario;
        }

        double novoSalario = salario + reajuste;
        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n",reajuste);
        System.out.printf("Em percentual: %d %%%n",percentual);
    }
 
}