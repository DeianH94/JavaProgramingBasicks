package exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        final int FACEBOOK_PENALTY = 150;
        final int INTSTAGRAM_PENALTY = 100;
        final int REDDIT_PENALTY = 50;
        Scanner scanner = new Scanner(System.in);

        int numOfSites = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfSites; i++) {
            String site = scanner.nextLine().toLowerCase();
            if (site.equals("facebook")) {
                salary -= FACEBOOK_PENALTY;
            }

            if (site.equals("instagram")) {
                salary -= INTSTAGRAM_PENALTY;
            }

            if (site.equals("reddit")) {
                salary -= REDDIT_PENALTY;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary);
    }
}
