package exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputAmount = Double.parseDouble(scanner.nextLine());
        int returnAmount = (int) (inputAmount * 100);
        int coinCount = 0;

        while (returnAmount > 0) {
            if (returnAmount - 200 >= 0) {
                returnAmount -= 200;
                coinCount++;
            } else if (returnAmount - 100 >= 0) {
                returnAmount -= 100;
                coinCount++;
            } else if (returnAmount - 50 >= 0) {
                returnAmount -= 50;
                coinCount++;
            } else if (returnAmount - 20 >= 0) {
                returnAmount -= 20;
                coinCount++;
            } else if (returnAmount - 10 >= 0) {
                returnAmount -= 10;
                coinCount++;
            } else if (returnAmount - 5 >= 0) {
                returnAmount -= 5;
                coinCount++;
            } else if (returnAmount - 2 >= 0) {
                returnAmount -= 2;
                coinCount++;
            } else {
                returnAmount -= 1;
                coinCount++;
            }
        }

        System.out.println(coinCount);
    }
}
