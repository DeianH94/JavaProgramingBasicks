package exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                int sum = firstNum + secondNum;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even%n", firstNum, secondNum, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd%n", firstNum, secondNum, sum);
                }

                break;
            case "-":
                int difference = firstNum - secondNum;
                if (difference % 2 == 0) {
                    System.out.printf("%d - %d = %d - even%n", firstNum, secondNum, difference);
                } else {
                    System.out.printf("%d - %d = %d - odd%n", firstNum, secondNum, difference);
                }

                break;
            case "*":
                int product = firstNum * secondNum;
                if (product % 2 == 0) {
                    System.out.printf("%d * %d = %d - even%n", firstNum, secondNum, product);
                } else {
                    System.out.printf("%d * %d = %d - odd%n", firstNum, secondNum, product);
                }
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.printf("Cannot divide %d by zero%n", firstNum);
                } else {
                    double quotient = (double) firstNum / secondNum;
                    System.out.printf("%d / %d = %.2f%n", firstNum, secondNum, quotient);
                }

                break;
            case "%":
                if (secondNum == 0) {
                    System.out.printf("Cannot divide %d by zero", firstNum);
                } else {
                    int remainder = firstNum % secondNum;
                    System.out.printf("%d %% %d = %d%n", firstNum, secondNum, remainder);
                }

                break;
        }
    }
}
