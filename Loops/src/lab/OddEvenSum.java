package lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numOfLines; i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(scanner.nextLine());
            } else {
                oddSum += Integer.parseInt(scanner.nextLine());
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d%n", Math.abs(evenSum - oddSum));
        }
    }
}
