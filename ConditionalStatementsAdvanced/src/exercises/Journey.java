package exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        double spendMoney;
        String destination;
        String typeOfVacation;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                spendMoney = budget * 0.3;
                typeOfVacation = "Camp";
            } else {
                spendMoney = budget * 0.7;
                typeOfVacation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                spendMoney = budget * 0.4;
                typeOfVacation = "Camp";
            } else {
                spendMoney = budget * 0.8;
                typeOfVacation = "Hotel";
            }
        } else {
            destination = "Europe";
            spendMoney = budget * 0.9;
            typeOfVacation = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", typeOfVacation, spendMoney);
    }
}
