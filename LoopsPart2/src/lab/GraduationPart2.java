package lab;

import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        double gradeSum = 0;
        int passedClasses = 1;
        int numOfFails = 0;

        while (passedClasses <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                gradeSum += grade;
                passedClasses++;
            } else {
                numOfFails++;
            }

            if (numOfFails > 1) {
                System.out.printf("%s has been excluded at %d grade%n",
                        studentName,
                        passedClasses);
                return;
            }
        }

        System.out.printf("%s graduated. Average grade: %.2f%n", studentName, gradeSum / 12);
    }
}
