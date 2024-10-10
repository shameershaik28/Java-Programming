import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<=1)
        {
            return;
        }

        Boolean isPrime= true;
        for (int i = 2; i * i <= N; i++) {
            // if we find any divisors between i*i <=36 its not a prime
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    }
