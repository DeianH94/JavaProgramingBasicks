package lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        double gradeSum = 0;
        int passedClasses = 0;

        while (passedClasses < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                gradeSum += grade;
                passedClasses++;
            }
        }

        System.out.printf("%s graduated. Average grade: %.2f%n", studentName, gradeSum / 12);
    }
}
