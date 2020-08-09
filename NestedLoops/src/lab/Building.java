package lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfFloors = Integer.parseInt(scanner.nextLine());
        int numOfRooms = Integer.parseInt(scanner.nextLine());

        for (int i = numOfFloors; i > 0; i--) {
            for (int j = 0; j < numOfRooms; j++) {
                if (i == numOfFloors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }

            System.out.println();
        }
    }
}
