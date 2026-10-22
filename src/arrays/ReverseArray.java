package arrays;


import java.util.Scanner;

public class ReverseArray {

    public static int[] solve(int[] A) {
        int N = A.length;
        int[] Arr = new int[N];

        for (int i = 0; i < N; i++) {
            Arr[N - 1 - i] = A[i];
        }

        return Arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] result = solve(A);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

