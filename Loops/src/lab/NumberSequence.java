package lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numOfLines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
