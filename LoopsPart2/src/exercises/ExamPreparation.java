package exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfFails = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();
        int failCount = 0;
        double gradeSum = 0;
        int problemCount = 0;
        String lastTaskName = "";

        while (numOfFails > failCount && !taskName.toLowerCase().equals("enough")) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade <= 4) {
                failCount++;
            }

            if (failCount >= numOfFails) {
                System.out.printf("You need a break, %d poor grades.%n", failCount);
                return;
            }

            gradeSum += grade;
            problemCount++;
            lastTaskName = taskName;

            taskName = scanner.nextLine();
        }

        System.out.printf("Average score: %.2f%n", gradeSum / problemCount);
        System.out.println("Number of problems: " + problemCount);
        System.out.println("Last problem: " + lastTaskName);
    }
}
