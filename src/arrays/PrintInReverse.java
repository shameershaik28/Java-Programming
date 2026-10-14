package arrays;

import java.util.Scanner;

public class PrintInReverse {

    public static void solve(int[] A) {
        int s = 0;
        int e = A.length - 1;

        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;

            s++;
            e--;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        solve(A);

        sc.close();
    }
}
