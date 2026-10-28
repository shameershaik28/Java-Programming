package arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class ListWithPrimeNumbers {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);

            if (isPrime(num)) {
                arr.add(num);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        ArrayList<Integer> result = solve(A);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));

            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

