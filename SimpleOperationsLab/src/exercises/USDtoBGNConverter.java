package exercises;

import java.util.Scanner;

public class USDtoBGNConverter {
    public static void main(String[] args) {
        final double USD_TO_BGN_RATIO = 1.79549;

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter amount if USD: ");
        double dollarAmount = Double.parseDouble(scanner.nextLine());
        double levaAmount = dollarAmount * USD_TO_BGN_RATIO;

        //System.out.printf("Amount id Bulgarian leva %.2f%n", levaAmount);
        System.out.printf("%.2f%n", levaAmount);
    }
}
