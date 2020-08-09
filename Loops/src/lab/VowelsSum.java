package lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        int score = 0;

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                    score++;
                    break;
                case 'e':
                    score += 2;
                    break;
                case 'i':
                    score += 3;
                    break;
                case 'o':
                    score += 4;
                    break;
                case 'u':
                    score += 5;
                    break;
            }
        }

        System.out.println(score);
    }
}
