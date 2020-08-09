package lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        final String SAVED_PASSWORD = "s3cr3t!P@ssw0rd";

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        if (userInput.equals(SAVED_PASSWORD)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
