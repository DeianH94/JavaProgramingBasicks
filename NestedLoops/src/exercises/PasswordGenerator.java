package exercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < l; k++) {
                    for (int m = 0; m < l; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                char firstChar = (char) (k + 97);
                                char secondChar = (char) (m + 97);
                                String pass = "" + i + j + firstChar + secondChar + o;
                                System.out.print(pass + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
