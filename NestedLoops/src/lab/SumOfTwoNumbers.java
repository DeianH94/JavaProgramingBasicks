package lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = starOfInterval; i <= endOfInterval; i++) {
            for (int j = starOfInterval; j <= endOfInterval; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%s + %d = %d)%n", counter, i, j, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d%n", counter, magicNumber);
    }
}
