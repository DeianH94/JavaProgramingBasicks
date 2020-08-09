package lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        int sum = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            sum += num;

            input = scanner.nextLine().toLowerCase();
        }

        System.out.println(sum);
    }
}
