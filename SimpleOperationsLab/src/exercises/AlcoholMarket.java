package exercises;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(scanner.nextLine());
        double beerAmount = Double.parseDouble(scanner.nextLine());
        double wineAmount = Double.parseDouble(scanner.nextLine());
        double rakiaAmount = Double.parseDouble(scanner.nextLine());
        double whiskyAmount = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskyPrice * 0.5;
        double winePrice = rakiaPrice - (0.4 * rakiaPrice);
        double beerPrice = rakiaPrice - (0.8 * rakiaPrice);

        double rakiaSum = rakiaPrice * rakiaAmount;
        double beerSum = beerPrice * beerAmount;
        double wineSum = winePrice * wineAmount;
        double whiskySum = whiskyPrice * whiskyAmount;
        double total = rakiaSum + beerSum + wineSum + whiskySum;

        System.out.printf("%.2f%n", total);
    }
}
