package exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine().toLowerCase();
        int numOfRows = Integer.parseInt(scanner.nextLine());
        int numOfColumns = Integer.parseInt(scanner.nextLine());
        double ticketPrice;

        if (projectionType.equals("premiere")) {
            ticketPrice = 12.00;
        } else if (projectionType.equals("normal")) {
            ticketPrice = 7.50;
        } else {
            ticketPrice = 5.00;
        }

        double profit = ticketPrice * numOfRows * numOfColumns;

        System.out.printf("%.2f leva%n", profit);
    }
}
