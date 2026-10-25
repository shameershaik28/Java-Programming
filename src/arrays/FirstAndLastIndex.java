package arrays;


import java.util.Scanner;

public class FirstAndLastIndex {

    public static int[] solve(int[] A, int B) {
        int n = A.length;
        int[] res = new int[2];

        // Find the first occurrence
        for (int i = 0; i < n; i++) {
            if (A[i] == B) {
                res[0] = i;
                break;
            }
        }

        // Find the last occurrence
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] == B) {
                res[1] = i;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        int[] result = solve(A, B);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}

