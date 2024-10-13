import java.util.Arrays;
import java.util.Scanner;

public class ReversePartOfArray {
    public int[] solve(int[] A, int B, int C) {

        if (B < 0 || C >= A.length || B > C) {
            System.out.println("Invalid input range");
            return A;
        }
        while(B < C)
        {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B = B + 1;
            C = C - 1;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        System.out.println("Enter the start Index");
        int B = sc.nextInt();
        System.out.println("Enter the end Index");
        int C = sc.nextInt();

        int[] A = new int[N];

        System.out.println("Enter the elements in array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        ReversePartOfArray obj = new ReversePartOfArray();
        obj.solve(A, B, C);
        System.out.println("Result: "+ Arrays.toString(A));
    }
}