package exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputNumber = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine().toLowerCase();
        String desiredUnit = scanner.nextLine().toLowerCase();
        double convertedNumber;

        if (inputUnit.equals("mm")) {
            if (desiredUnit.equals("cm")) {
                convertedNumber = inputNumber / 10;
            } else {
                convertedNumber = inputNumber / 1000;
            }
        } else if (inputUnit.equals("cm")) {
            if (desiredUnit.equals("mm")) {
                convertedNumber = inputNumber * 10;
            } else {
                convertedNumber = inputNumber / 100;
            }
        } else {
            if (desiredUnit.equals("mm")) {
                convertedNumber = inputNumber * 1000;
            } else {
                convertedNumber = inputNumber * 100;
            }
        }

        System.out.printf("%.3f", convertedNumber);
    }
}
