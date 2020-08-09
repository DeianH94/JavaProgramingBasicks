package exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;

        while (savedMoney < vacationPrice && spendingCounter < 5) {
            String command = scanner.nextLine().toLowerCase();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (command.equals("save")) {
                savedMoney += money;
                spendingCounter = 0;
            } else if (command.equals("spend")) {
                savedMoney -= money;
                spendingCounter++;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }
            }
        }

        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }

        if (savedMoney >= vacationPrice) {
            System.out.printf("You saved the money for %d days.%n", daysCounter);
        }
    }
}
