package exercises;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < numOfLines; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                p1++;
            }

            if (number % 3 == 0) {
                p2++;
            }

            if (number % 4 == 0) {
                p3++;
            }
        }

        System.out.printf("%.2f%%%n", (double) p1 / numOfLines * 100);
        System.out.printf("%.2f%%%n", (double) p2 / numOfLines * 100);
        System.out.printf("%.2f%%%n", (double) p3 / numOfLines * 100);
    }
}
