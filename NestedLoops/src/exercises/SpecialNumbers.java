package exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean isValid = true;

        for (int i = 1111; i <= 9999; i++) {
            int firstNum = i % 10;
            int secondNum = (i % 100) / 10;
            int thirdNum = (i % 1000) / 100;
            int lastNum = (i % 10000) / 1000;

            if (firstNum != 0 && secondNum != 0 && thirdNum != 0 && lastNum != 0) {
                if (!(num % firstNum == 0)) {
                    isValid = false;
                }

                if (!(num % secondNum == 0)) {
                    isValid = false;
                }

                if (!(num % thirdNum == 0)) {
                    isValid = false;
                }

                if (!(num % lastNum == 0)) {
                    isValid = false;
                }

                if (isValid) {
                    System.out.print(i + " ");
                }
            }

            isValid = true;
        }
    }
}
