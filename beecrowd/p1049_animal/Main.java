package beecrowd.p1049_animal;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String seletor1 = scanner.nextLine();
        String seletor2 = scanner.nextLine();
        String seletor3 = scanner.nextLine();
        scanner.close();

        String animal;
 
        if (seletor1.equals("vertebrado")){
            if (seletor2.equals("ave")){
                animal = seletor3.equals("carnivoro") ? "aguia" : "pomba";
            }
            else {
                animal = seletor3.equals("onivoro") ? "homem" : "vaca";
            } 
        } else {
            if (seletor2.equals("inseto")){
                animal = seletor3.equals("hematofago") ? "pulga" : "lagarta";
            }
            else {
                animal = seletor3.equals("hematofago") ? "sanguessuga" : "minhoca";
            } 
        }

        System.out.println(animal);
    }
 
}
