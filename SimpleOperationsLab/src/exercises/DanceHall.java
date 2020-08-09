package exercises;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        final int DANCER_VOLUME = 40;
        final int SPACE_PER_DANCER = 7000;
        final int BENCH_TO_HALL_RATIO = 10;

        Scanner scanner = new Scanner(System.in);

        //these values are in meters
        double hallLength = Double.parseDouble(scanner.nextLine());
        double hallWidth = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        //hall size in square centimeters
        double hallSize = (hallLength * 100) * (hallWidth * 100);
        double wardrobeSize = (wardrobeSide * wardrobeSide) * 10000;
        double benchSize = hallSize / BENCH_TO_HALL_RATIO;
        double freeSpace = hallSize - wardrobeSize - benchSize;
        int numberOfDancers = (int) Math.floor(freeSpace / (DANCER_VOLUME + SPACE_PER_DANCER));

        System.out.println(numberOfDancers);
    }
}
