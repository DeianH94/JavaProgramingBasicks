package exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakePieces = width * length;
        String input = scanner.nextLine();

        while (cakePieces > 0 && !input.toLowerCase().equals("stop")) {
            int takenPieces = Integer.parseInt(input);
            cakePieces -= takenPieces;

            if (cakePieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
                return;
            }

            input = scanner.nextLine();
        }

        System.out.println(cakePieces + " pieces are left.");
    }
}
