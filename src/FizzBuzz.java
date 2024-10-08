import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N > 0 && N <= 1000) {

            if (N % 3 == 0 && N % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (N % 3 == 0) {
                System.out.println("Fizz");
            } else if (N % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
