package exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        final double DELAY_DUE_TO_WATER_RESISTANCE_PER_15_METERS = 12.5;
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double perfectTime = distance * timeForOneMeter;
        double delayTime = Math.floor(distance / 15) * DELAY_DUE_TO_WATER_RESISTANCE_PER_15_METERS;
        double totalTime = perfectTime + delayTime;

        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.%n", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.%n", totalTime - worldRecord);
        }
    }
}
