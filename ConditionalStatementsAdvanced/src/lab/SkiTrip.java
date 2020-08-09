package lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        final double ROOM_FOR_ONE_PRICE = 18.00;
        final double APARTMENT_PRICE = 25.00;
        final double PRESIDENTIAL_APARTMENT_PRICE = 35.00;
        Scanner scanner = new Scanner(System.in);

        int numberOfNights = Integer.parseInt(scanner.nextLine()) - 1;
        String typeOfRoom = scanner.nextLine().toLowerCase();
        String rating = scanner.nextLine().toLowerCase();
        double price;
        double daysDiscount;
        double ratingDiscount;

        if (typeOfRoom.equals("room for one person")) {
            price = ROOM_FOR_ONE_PRICE * numberOfNights;
        } else if (typeOfRoom.equals("apartment")) {
            price = APARTMENT_PRICE * numberOfNights;
            if (numberOfNights < 10) {
                daysDiscount = price * 0.3;
            } else if ( numberOfNights < 15) {
                daysDiscount = price * 0.35;
            } else {
                daysDiscount = price * 0.5;
            }

            price -= daysDiscount;
        } else {
            price = PRESIDENTIAL_APARTMENT_PRICE * numberOfNights;
            if (numberOfNights < 10) {
                daysDiscount = price * 0.1;
            } else if ( numberOfNights < 15) {
                daysDiscount = price * 0.15;
            } else {
                daysDiscount = price * 0.2;
            }

            price -= daysDiscount;
        }

        if (rating.equals("positive")) {
            ratingDiscount = price * 0.25;
            price += ratingDiscount;
        } else {
            ratingDiscount = price * 0.10;
            price -= ratingDiscount;
        }

        System.out.printf("%.2f%n", price);
    }
}
