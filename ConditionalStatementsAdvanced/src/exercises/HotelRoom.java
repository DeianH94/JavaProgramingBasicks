package exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        int numOfNights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "may":
            case "october":
                if (numOfNights > 14) {
                    studioPrice = 35 * numOfNights;
                    apartmentPrice = 58.5 * numOfNights;
                } else if (numOfNights > 7) {
                    studioPrice = 47.5 * numOfNights;
                    apartmentPrice = 65 * numOfNights;
                } else {
                    studioPrice = 50 * numOfNights;
                    apartmentPrice = 65 * numOfNights;
                }

                break;
            case "june":
            case "september":
                if (numOfNights > 14) {
                    studioPrice = 60.16 * numOfNights;
                    apartmentPrice = 61.83 * numOfNights;
                } else {
                    studioPrice = 75.20 * numOfNights;
                    apartmentPrice = 68.70 * numOfNights;
                }

                break;
            case "july":
            case "august":
                studioPrice = 76 * numOfNights;

                if (numOfNights > 14) {
                    apartmentPrice = 69.3 * numOfNights;
                } else {
                    apartmentPrice = 77 * numOfNights;
                }

                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", studioPrice);
    }
}
