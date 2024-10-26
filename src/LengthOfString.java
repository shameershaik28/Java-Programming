import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of test Cases: ");
        int T = scanner.nextInt();

        scanner.nextLine();

        for(int i=0; i<T; i++) {
            System.out.print("Enter the string: ");
            String userInput = scanner.nextLine();
          System.out.println("You entered: " + userInput);
        }
    }
}
