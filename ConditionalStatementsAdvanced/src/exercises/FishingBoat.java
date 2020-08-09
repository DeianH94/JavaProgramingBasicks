package exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        int numOfFishermen = Integer.parseInt(scanner.nextLine());

        double price;
        double discount;

        if (season.equals("spring")) {
            price = 3000;
        } else if (season.equals("winter")) {
            price = 2600;
        } else {
            price = 4200;
        }

        if (numOfFishermen <= 6) {
            discount = price * 0.1;
        } else if (numOfFishermen <= 11) {
            discount = price * 0.15;
        } else {
            discount = price * 0.25;
        }

        price -= discount;

        if (!season.equals("autumn") && numOfFishermen % 2 == 0) {
            discount = price * 0.05;
            price -= discount;
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
