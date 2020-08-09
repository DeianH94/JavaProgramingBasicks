package exercises;

import java.util.Scanner;

public class RectangleAreaInPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter x1: ");
        double x1 = Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter y1: ");
        double y1 = Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter x2: ");
        double x2 = Double.parseDouble(scanner.nextLine());
        //System.out.print("Enter y2: ");
        double y2 = Double.parseDouble(scanner.nextLine());

        double length = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        //System.out.printf("The area of the rectangle is: %.2f%n", rectangleArea);
        //System.out.printf("the perimeter of the rectangle is: %.2f%n", rectanglePerimeter);
        System.out.printf("%.2f%n", rectangleArea);
        System.out.printf("%.2f%n", rectanglePerimeter);
    }
}
