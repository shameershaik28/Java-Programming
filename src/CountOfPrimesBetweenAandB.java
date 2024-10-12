import java.util.Scanner;

public class CountOfPrimesBetweenAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int primeCount = 0;

        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // Check divisors from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // If no divisors, it's prime
    }
}
