package exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        final int STEP_GOAL = 10000;
        Scanner scanner = new Scanner(System.in);

        String input;
        int stepCount = 0;

        while (stepCount < STEP_GOAL) {
            input = scanner.nextLine();
            if (input.toLowerCase().equals("going home")) {
                input = scanner.nextLine();
                int lastSteps = Integer.parseInt(input);
                stepCount += lastSteps;
                break;
            } else {
                int steps = Integer.parseInt(input);
                stepCount += steps;
            }
        }

        if (stepCount >= STEP_GOAL) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.%n", STEP_GOAL - stepCount);
        }
    }
}
