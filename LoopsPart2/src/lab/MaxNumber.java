package lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int max = Integer.MIN_VALUE;

        while (counter < numOfLines) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            max = Math.max(max, currentNum);
            counter++;
        }

        System.out.println(max);
    }
}
