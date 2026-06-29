package beecrowd.p1052_mes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        @SuppressWarnings("ConvertToTryWithResources")        
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();
        scanner.close();

        String month = switch(entrada){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalArgumentException("Invalid month: " + entrada);
        };
        System.out.println(month);
    }

}
