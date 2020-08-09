package exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHours = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examHours * 60 + examMinutes;
        int arriveTimeInMinutes = arriveHours * 60 + arriveMinutes;

        if (examTimeInMinutes - arriveTimeInMinutes > 30) {
            System.out.println("Early");
            int difference = examTimeInMinutes - arriveTimeInMinutes;
            int hours = difference / 60;
            int minutes = difference % 60;
            if (hours > 0) {
                System.out.printf("%d:%02d hours before the start" , hours, minutes);
            } else {
                System.out.printf("%d minutes before the start" , minutes);
            }
        } else if (examTimeInMinutes - arriveTimeInMinutes >= 0) {
            System.out.println("On time");
            int difference = examTimeInMinutes - arriveTimeInMinutes;
            int minutes = difference % 60;
            if (minutes != 0) {
                System.out.printf("%d minutes before the start" , minutes);
            }
        } else {
            System.out.println("Late");
            int difference = arriveTimeInMinutes - examTimeInMinutes;
            int hours = difference / 60;
            int minutes = difference % 60;
            if (hours > 0) {
                System.out.printf("%d:%02d hours after the start" , hours, minutes);
            } else {
                System.out.printf("%d minutes after the start" , minutes);
            }
        }
    }
}
