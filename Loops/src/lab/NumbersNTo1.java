package lab;

import java.util.Scanner;

public class NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startingNumber; i > 0; i--) {
            System.out.println(i);
        }
    }
}
