package arrays;


import java.util.Scanner;

public class UniqueElement {

    public static int solve(int[] A) {
        int val = 0;

        for (int i = 0; i < A.length; i++) {
            val ^= A[i];
        }

        return val;
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

