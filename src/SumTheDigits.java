import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // input for each test case

            int sum = 0;
            // Calculate the sum of digits of N
            while (N > 0) {
                int V = N % 10;  // Get the last digit
                sum += V;        // Add the digit to sum
                N /= 10;         // Remove the last digit
            }
            // Output the result
            System.out.println(sum);
        }
    }
}
