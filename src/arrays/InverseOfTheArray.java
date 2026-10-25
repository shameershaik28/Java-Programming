package arrays;


import java.util.Scanner;

public class InverseOfTheArray {

    public static int[] solve(int[] A) {
        int N = A.length;
        int[] inverse = new int[N];

        for (int i = 0; i < N; i++) {
            inverse[A[i]] = i;
        }

        return inverse;
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

