package lab;

import java.util.Scanner;

public class Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= endNumber; i += 3) {
            System.out.println(i);
        }
    }
}
