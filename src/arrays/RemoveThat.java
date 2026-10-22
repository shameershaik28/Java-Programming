package arrays;


import java.util.Scanner;

public class RemoveThat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int X = sc.nextInt();
        int[] newArr = new int[N - 1];

        for (int i = 0; i < X - 1; i++) {
            newArr[i] = A[i];
        }

        // Skip the element at position X
        for (int i = X; i < N; i++) {
            newArr[i - 1] = A[i];
        }

        for (int i = 0; i < N - 1; i++) {
            System.out.print(newArr[i]);

            if (i < N - 2) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

