package exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        final double ROSES_PRICE = 5.00;
        final double DAHLIA_PRICE = 3.80;
        final double TULIP_PRICE = 2.80;
        final double NARCISSUS_PRICE = 3.00;
        final double GLADIOLA_PRICE = 2.50;

        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double discount = 0;

        switch (flowerType.toLowerCase()) {
            case "roses":
                price = numOfFlowers * ROSES_PRICE;
                if (numOfFlowers > 80) {
                    discount = price * 0.1;
                    price -= discount;
                }

                break;
            case "dahlias":
                price = numOfFlowers * DAHLIA_PRICE;
                if (numOfFlowers > 90) {
                    discount = price * 0.15;
                    price -= discount;
                }

                break;
            case "tulips":
                price = numOfFlowers * TULIP_PRICE;
                if (numOfFlowers > 80) {
                    discount = price * 0.15;
                    price -= discount;
                }

                break;
            case "narcissus":
                price = numOfFlowers * NARCISSUS_PRICE;
                if (numOfFlowers < 120) {
                    discount = price * 0.15;
                    price += discount;
                }

                break;
            case "gladiolus":
                price = numOfFlowers * GLADIOLA_PRICE;
                if (numOfFlowers < 80) {
                    discount = price * 0.2;
                    price += discount;
                }

                break;
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n",
                    numOfFlowers,
                    flowerType,
                    budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.%n", price - budget);
        }
    }
}
