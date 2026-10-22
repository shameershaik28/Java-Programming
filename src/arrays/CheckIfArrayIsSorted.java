package arrays;


import java.util.Scanner;

public class CheckIfArrayIsSorted {

    public static int solve(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(A));

        sc.close();
    }
}

