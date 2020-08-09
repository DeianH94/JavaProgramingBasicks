package lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine().toLowerCase();
        String dayOfWeek = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f%n", 2.50 * quantity);
                        break;
                    case "apple":
                        System.out.printf("%.2f%n", 1.20 * quantity);
                        break;
                    case "orange":
                        System.out.printf("%.2f%n", 0.85 * quantity);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f%n", 1.45 * quantity);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f%n", 2.70 * quantity);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f%n", 5.50 * quantity);
                        break;
                    case "grapes":
                        System.out.printf("%.2f%n", 3.85 * quantity);
                        break;
                    default:
                        System.out.println("error");
                }

                break;
            case "saturday":
            case "sunday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f%n", 2.70 * quantity);
                        break;
                    case "apple":
                        System.out.printf("%.2f%n", 1.25 * quantity);
                        break;
                    case "orange":
                        System.out.printf("%.2f%n", 0.9 * quantity);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f%n", 1.60 * quantity);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f%n", 3.00 * quantity);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f%n", 5.60 * quantity);
                        break;
                    case "grapes":
                        System.out.printf("%.2f%n", 4.20 * quantity);
                        break;
                    default:
                        System.out.println("error");
                }

                break;
            default:
                System.out.println("error");
        }
    }
}
