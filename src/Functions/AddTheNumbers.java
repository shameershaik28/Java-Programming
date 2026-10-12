package Functions;

import java.util.Scanner;

public class AddTheNumbers {

    public static int solve(int A, int B) {
        int C = A + B;
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(solve(A, B));

        sc.close();
    }
}
