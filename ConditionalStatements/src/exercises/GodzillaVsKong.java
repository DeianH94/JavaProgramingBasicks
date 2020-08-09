package exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int numberOfExtras = Integer.parseInt(scanner.nextLine());
        double clothingPricePerExtra = Double.parseDouble(scanner.nextLine());

        double decorPrice = filmBudget * 0.1;
        double clothesPrice = numberOfExtras * clothingPricePerExtra;
        if (numberOfExtras > 150) {
            double discount = clothesPrice * 0.1;
            clothesPrice -= discount;
        }

        double leftOverMoney = filmBudget - (decorPrice + clothesPrice);

        if (leftOverMoney >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.%n", leftOverMoney);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(leftOverMoney));
        }
    }
}
