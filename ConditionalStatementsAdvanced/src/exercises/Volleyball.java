package exercises;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine().toLowerCase();
        int numOfHolidays = Integer.parseInt(scanner.nextLine());
        int numOfWeekendsToTravel = Integer.parseInt(scanner.nextLine());

        double gamesInSofia = (48 - numOfWeekendsToTravel) * (3.0 / 4);
        double gamesDuringHolidays = numOfHolidays * (2.0 / 3);

        double totalGames = gamesInSofia + numOfWeekendsToTravel + gamesDuringHolidays;

        if (yearType.equals("leap")) {
            double bonus = totalGames * 0.15;
            totalGames += bonus;
        }

        System.out.println(Math.floor(totalGames));
    }
}
