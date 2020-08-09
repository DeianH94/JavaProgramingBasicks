package exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        final double CAKE_PRICE = 45;
        final double WAFFLE_PRICE = 5.80;
        final double PANCAKE_PRICE = 3.20;

        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double profitFromCakes = numberOfCakes * CAKE_PRICE;
        double profitFromWaffles = numberOfWaffles * WAFFLE_PRICE;
        double profitFromPancakes = numberOfPancakes * PANCAKE_PRICE;
        double profitFromOneDay = (profitFromCakes + profitFromWaffles + profitFromPancakes) * numberOfBakers;
        double totalGatheredSum = profitFromOneDay * numberOfDays;
        double profit = totalGatheredSum - (totalGatheredSum / 8);

        System.out.printf("%.2f%n", profit);
    }
}
