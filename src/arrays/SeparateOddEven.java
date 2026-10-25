package arrays;


import java.util.Scanner;

public class SeparateOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Print odd elements
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 != 0) {
                    System.out.print(A[i] + " ");
                }
            }

            System.out.println();

            // Print even elements
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 == 0) {
                    System.out.print(A[i] + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

