package lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int min = Integer.MAX_VALUE;

        while (counter < numOfLines) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            min = Math.min(min, currentNum);
            counter++;
        }

        System.out.println(min);
    }
}
