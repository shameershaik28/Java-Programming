import java.util.Scanner;

public class Circle {
    // Define properties here
int radius;

    // Define constructor here
   Circle(int r) {
       radius = r;
}

    float perimeter() {
        // Complete the function
        return 2 * (float)Math.PI * radius;
    }

    float area() {
        // Complete the function
        return (float)Math.PI * radius * radius;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

            System.out.print("Enter the number of test cases: "); // Prompt the user for number of test cases
            int testCases = scanner.nextInt(); // Read the number of test cases

            for (int i = 0; i < testCases; i++) {
                System.out.print("Enter the radius of circle " + (i + 1) + ": "); // Prompt for radius
                int r = scanner.nextInt(); // Read the radius as an integer

                Circle a = new Circle(r); // Create a Circle object with the input radius

                System.out.printf("Circle %d - Perimeter: %.2f, Area: %.2f%n", (i + 1), a.perimeter(), a.area()); // Print the results
            }
    }
}