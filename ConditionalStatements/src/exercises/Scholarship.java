package exercises;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());
        double gradeScholarship = 0;
        double welfareScholarship = 0;

        if (averageScore >= 5.5) {
            gradeScholarship = averageScore * 25;
        }

        if (income < minWage && averageScore >= 4.5) {
            welfareScholarship = minWage * 0.35;
        }

        if (welfareScholarship != 0 || gradeScholarship != 0) {
            if (gradeScholarship >= welfareScholarship) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN%n", Math.floor(gradeScholarship));
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(welfareScholarship));
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
