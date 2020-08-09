package exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine().toLowerCase();
        int libraryCapacity = Integer.parseInt(scanner.nextLine());
        String currentBook = "";
        int counter = 0;
        boolean isFound = false;

        while (!isFound && libraryCapacity > counter) {
            currentBook = scanner.nextLine().toLowerCase();
            if (currentBook.equals(bookName)) {
                isFound = true;
            } else {
                counter++;
            }
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
