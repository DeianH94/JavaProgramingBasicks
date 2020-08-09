package lab;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the side of the square: ");
        int squareSide = Integer.parseInt(scanner.nextLine());
        int squareArea = squareSide * squareSide;

        //System.out.printf("The perimeter is: %d%n", squareArea);
        System.out.println(squareArea);
    }
}
