package lab;

import java.util.Scanner;

public class ProjectTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the architect's name: ");
        String architectName = scanner.nextLine();
        //System.out.print("Enter the number of projects: ");
        int numOfProjects = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.%n",
                architectName,
                numOfProjects * 3,
                numOfProjects);
    }
}
