package lab;

import java.util.Scanner;

public class InchToCmConverter {
    public static void main(String[] args) {
        final double CENTIMETERS_TO_INCHES_RATIO = 2.54;

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter length in inches: ");
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * CENTIMETERS_TO_INCHES_RATIO;

        //System.out.printf("The length in centimeters is: %.2f%n", cm);
        System.out.printf("%.2f%n", cm);
    }
}
