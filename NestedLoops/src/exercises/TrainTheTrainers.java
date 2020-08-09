package exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJudges = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sumAllGrades = 0;
        int numOfProjects = 0;

        while (!input.toLowerCase().equals("finish")) {
            String presentationName = input;
            double gradeSum = 0.0;
            for (int i = 0; i < numOfJudges; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                gradeSum += currentGrade;
            }

            double averageGrade = gradeSum / numOfJudges;
            sumAllGrades += averageGrade;
            numOfProjects++;

            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", sumAllGrades / numOfProjects);
    }
}
