package lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        final double PUZZLE_PRICE = 2.60;
        final double TALKING_DOLL_PRICE = 3.00;
        final double TEDDY_BEAR_PRICE = 4.10;
        final double MINION_PRICE = 8.20;
        final double TRUCK_PRICE = 2.00;

        Scanner scanner = new Scanner(System.in);

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int soldPuzzles = Integer.parseInt(scanner.nextLine());
        int soldTalkingDolls = Integer.parseInt(scanner.nextLine());
        int soldTeddyBears = Integer.parseInt(scanner.nextLine());
        int soldMinions = Integer.parseInt(scanner.nextLine());
        int soldTrucks = Integer.parseInt(scanner.nextLine());

        double totalSum = soldPuzzles * PUZZLE_PRICE
                + soldTalkingDolls * TALKING_DOLL_PRICE
                + soldTeddyBears * TEDDY_BEAR_PRICE
                + soldMinions * MINION_PRICE
                + soldTrucks * TRUCK_PRICE;

        int numberOfSoldToys = soldPuzzles + soldTalkingDolls + soldTeddyBears + soldMinions + soldTrucks;

        if (numberOfSoldToys >= 50) {
            double discount = totalSum * 0.25;
            totalSum -= discount;
        }

        double rent = totalSum * 0.10;
        double profit = totalSum - rent;

        if (profit >= tourPrice) {
            System.out.printf("Yes! %.2f lv left.%n", profit - tourPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.%n", tourPrice - profit);
        }
    }
}
