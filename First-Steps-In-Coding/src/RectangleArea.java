import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
    public static void main(String[] args) throws IOException {
        //Finds the area of a rectangle and prints it on the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter side a: ");
        int sideA = Integer.parseInt(reader.readLine());

        System.out.print("Enter side b: ");
        int sideB = Integer.parseInt(reader.readLine());

        int perimeter = sideA * sideB;
        System.out.printf("The area of the rectangle is %d%n", perimeter);
    }
}
