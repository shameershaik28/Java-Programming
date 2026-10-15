package arrays;


import java.util.Scanner;

public class PositionOfElementB {

    public static int solve(int[] A, int B) {
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (A[i] == B) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        System.out.println(solve(A, B));

        sc.close();
    }
}

