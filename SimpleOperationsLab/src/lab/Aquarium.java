package lab;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the length of the aquarium in cm: ");
        int length = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the width of the aquarium cm: ");
        int width = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the height of the aquarium cm: ");
        int height = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the percentage of sand: ");
        double sandPercentage = Double.parseDouble(scanner.nextLine()) * 0.01;

        //0.001 converts square centimeters into square decimeters
        double aquariumVolume = length * width * height * 0.001;
        double finalWaterVolume = aquariumVolume * (1 - sandPercentage);

        //System.out.printf("Necessary volume of water: %.3f%n", finalWaterVolume);
        System.out.printf("%.3f%n", finalWaterVolume);
    }
}
