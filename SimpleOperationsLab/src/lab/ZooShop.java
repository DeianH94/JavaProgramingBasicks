package lab;

import java.util.Scanner;

public class ZooShop {
    public static void main(String[] args) {
        final double DOG_FOOD_PRICE = 2.50;
        double OTHER_ANIMAL_FOOD_PRICE = 4;

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the number of dogs: ");
        int numOfDogs = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the number of other animals: ");
        int numOfOtherAnimals = Integer.parseInt(scanner.nextLine());
        double totalPrice = (DOG_FOOD_PRICE * numOfDogs) + (OTHER_ANIMAL_FOOD_PRICE * numOfOtherAnimals);

        //System.out.printf("The total price is %.2f%n", totalPrice);
        System.out.printf("%.2f lv.%n", totalPrice);
    }
}
