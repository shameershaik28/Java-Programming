package arrays;


import java.util.Scanner;

public class RightShiftAnArray {

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

        s = 1;
        e = N - 1;

        // Reverse elements from index 1 to N - 1
        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}

