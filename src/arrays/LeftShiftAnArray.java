package arrays;


import java.util.Scanner;

public class LeftShiftAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int s = 0;
        int e = N - 1;

        // Reverse the entire array
        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;

            s++;
            e--;
        }

        int s1 = 0;
        int e1 = N - 2;

        // Reverse elements from index 0 to N - 2
        while (s1 < e1) {
            int temp = A[s1];
            A[s1] = A[e1];
            A[e1] = temp;

            s1++;
            e1--;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}

