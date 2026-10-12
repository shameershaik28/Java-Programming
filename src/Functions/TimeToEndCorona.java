package Functions;

import java.util.Scanner;

public class TimeToEndCorona {

    public static int solve(int A, int B, int C) {
        int count = 0;

        while (C > 0) {
            C = C + B - A;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Average cases recovered per day
        int B = sc.nextInt(); // New cases per day
        int C = sc.nextInt(); // Current active cases

        System.out.println(solve(A, B, C));

        sc.close();
    }
}
