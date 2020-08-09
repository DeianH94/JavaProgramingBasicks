package lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lillyAge = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double totalSaving = 0;

        for (int i = 1; i <= lillyAge; i++) {
            if (i % 2 == 0) {
                totalSaving = totalSaving + (i * 5) - 1;
            } else {
                totalSaving += toyPrice;
            }
        }

        if (totalSaving >= washerPrice) {
            System.out.printf("Yes! %.2f", totalSaving - washerPrice);
        } else {
            System.out.printf("No! %.2f", washerPrice - totalSaving);
        }
    }
}
