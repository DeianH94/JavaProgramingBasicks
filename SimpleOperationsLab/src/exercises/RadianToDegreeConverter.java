package exercises;

import java.util.Scanner;

public class RadianToDegreeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter angle value in radians: ");
        double angleInRadians = Double.parseDouble(scanner.nextLine());
        double angleInDegrees = angleInRadians * 180 / Math.PI;

        //System.out.printf("Angle in degrees: %.0f%n", angleInDegrees);
        System.out.printf("%.0f%n", angleInDegrees);
    }
}
