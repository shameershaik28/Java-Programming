package arrays;


import java.util.Scanner;

public class CountPairsWithSum {

    public static int solve(int[] A, int B) {
        int N = A.length;
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] + A[j] == B) {
                    count++;
                }
            }
        }

        return count;
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

