package lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int totalSpace = width * length * height;

        String input = scanner.nextLine().toLowerCase();

        while (!input.equals("done")) {
            int boxes = Integer.parseInt(input);
            totalSpace -= boxes;

            if (totalSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.%n",
                        Math.abs(totalSpace));
                return;
            }

            input = scanner.nextLine().toLowerCase();
        }

        System.out.printf("%d Cubic meters left.", totalSpace);
    }
}
