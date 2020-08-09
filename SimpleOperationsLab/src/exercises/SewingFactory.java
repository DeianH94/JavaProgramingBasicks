package exercises;

import java.util.Scanner;

public class SewingFactory {
    public static void main(String[] args) {
        final double PRICE_PER_SQUARE_METER_RECTANGLE = 7;
        final double PRICE_PER_SQUARE_METER_EMBROIDERED = 9;
        final double USD_TO_BGN_RATIO = 1.85;

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter number of tables: ");
        int numberOfTables = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the length of the tables in meters: ");
        double tableLength = Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter the width of the tables in meters: ");
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double totalTableclothArea = numberOfTables * (tableLength + 2 * 0.3) * (tableWidth + 2 * 0.3);
        double totalEmbroideredArea = numberOfTables * (tableLength / 2) * (tableLength / 2);
        double priceInDollars = totalTableclothArea
                * PRICE_PER_SQUARE_METER_RECTANGLE
                + totalEmbroideredArea
                * PRICE_PER_SQUARE_METER_EMBROIDERED;
        double priceInBGLeva = priceInDollars * USD_TO_BGN_RATIO;

        //System.out.printf("Price in US Dollars: %.2f%n", priceInDollars);
        //System.out.printf("Price in Bulgarian leva: %.2f%n", priceInBGLeva);
        System.out.printf("%.2f USD%n", priceInDollars);
        System.out.printf("%.2f BGN%n", priceInBGLeva);
    }
}
