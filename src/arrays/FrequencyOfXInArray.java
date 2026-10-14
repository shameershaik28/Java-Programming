package arrays;

import java.util.Scanner;

public class FrequencyOfXInArray {

    public static int solve(int[] A, int B) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count++;
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
