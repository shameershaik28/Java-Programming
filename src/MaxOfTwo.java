import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Check if the input values are within the specified constraints
        if (A < 1 || A > 1000000 || B < 1 || B > 1000000) {
            System.out.println("Input values must be between 1 and 1,000,000.");
            return;
        }

            if(A > B) {
                System.out.println(A);
            } else {
                System.out.println(B);
            }
        }
    }