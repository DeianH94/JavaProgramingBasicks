package lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine().toLowerCase();
        switch (typeOfFigure) {
            case "square":
                double side = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f%n", side * side);
                break;
            case "triangle":
                double base = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f%n", base * height / 2);
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f%n", Math.PI * Math.pow(radius, 2));
                break;
            case "rectangle":
                double firstSide = Double.parseDouble(scanner.nextLine());
                double secondSide = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f%n", firstSide * secondSide);
                break;
            default:
                System.out.println("Wrong figure type!");
        }
    }
}
