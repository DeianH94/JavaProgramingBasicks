package exercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -Double.MAX_VALUE;
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -Double.MAX_VALUE;

        for (int i = 1; i <= numOfLines; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
                evenMin = Math.min(evenMin, number);
                evenMax = Math.max(evenMax, number);
            } else {
                oddSum += number;
                oddMin = Math.min(oddMin, number);
                oddMax = Math.max(oddMax, number);
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum != 0) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum != 0) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        } else {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}
