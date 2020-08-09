package lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int standardSeats = 0;
        int kidSeats = 0;
        int studentSeats = 0;
        int occupiedCount = 0;

        while (true) {
            String filmName = scanner.nextLine();
            if (filmName.toLowerCase().equals("finish")) {
                break;
            }

            int freeSeats = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < freeSeats; i++) {
                String ticketType = scanner.nextLine().toLowerCase();
                if (ticketType.equals("end")) {
                    break;
                } else if (ticketType.equals("kid")) {
                    kidSeats++;
                } else if (ticketType.equals("student")) {
                    studentSeats++;
                } else {
                    standardSeats++;
                }

                totalTickets++;
                occupiedCount++;
            }

            System.out.printf("%s - %.2f%% full.%n", filmName, ((double)occupiedCount) / freeSeats * 100);
            occupiedCount = 0;
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", ((double)studentSeats) / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", ((double)standardSeats) / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", ((double)kidSeats) / totalTickets * 100);
    }
}
