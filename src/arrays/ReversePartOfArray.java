package arrays;


import java.util.Scanner;

public class ReversePartOfArray {

    public static int[] solve(int[] A, int B, int C) {
        int s = B;
        int e = C;

        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;

            s++;
            e--;
        }

        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] result = solve(A, B, C);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

