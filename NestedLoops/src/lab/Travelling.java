package lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.toLowerCase().equals("end")) {
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            double currentBudget = 0;
            while (minimalBudget > currentBudget) {
                double newSum = Double.parseDouble(scanner.nextLine());
                currentBudget += newSum;
            }

            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
