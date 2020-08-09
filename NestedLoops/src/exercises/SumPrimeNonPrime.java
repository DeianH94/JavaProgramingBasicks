package exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean nonPrime = false;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        nonPrime = true;
                        break;
                    }
                }

                if (nonPrime) {
                    nonPrimeSum += num;
                } else {
                    primeSum += num;
                }

                nonPrime = false;
            }

            input = scanner.nextLine().toLowerCase();
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
