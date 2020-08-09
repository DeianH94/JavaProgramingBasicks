package lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        //System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        //System.out.print("Enter your age name: ");
        int age = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter your town name: ");
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.%n", firstName, lastName, age, town);
    }
}
