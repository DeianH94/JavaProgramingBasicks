package lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        if (!(inputNumber == 0 || (inputNumber >= 100 && inputNumber <= 200))) {
            System.out.println("invalid");
        }
    }
}
