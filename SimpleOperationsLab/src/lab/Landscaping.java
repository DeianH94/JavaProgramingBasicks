package lab;

import java.util.Scanner;

public class Landscaping {
    public static void main(String[] args) {
        final double PRICE_PER_SQUARE_METER = 7.61;
        final double DISCOUNT_PERCENTAGE = 0.18;

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the amount of square meters: ");
        double squareMeters = Float.parseFloat(scanner.nextLine());

        double normalPrice = squareMeters * PRICE_PER_SQUARE_METER;
        double discount = normalPrice * DISCOUNT_PERCENTAGE;
        double finalPrice = normalPrice - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.%n", discount);
    }
}
