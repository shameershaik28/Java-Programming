package Functions;

import java.util.Scanner;

public class FindPercentage {

    public static int solve(int A, int B) {
        return (int) Math.ceil(A / (double) B * 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Marks obtained
        int B = sc.nextInt(); // Total marks

        System.out.println(solve(A, B));

        sc.close();
    }
}
