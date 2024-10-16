import java.util.Scanner;

public class PositionB {
    public int solve(int[] A, int B) {

        for(int i =0 ; i<A.length; i++)
        {
            if(A[i]==B)
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        PositionB solution = new PositionB();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        System.out.println("Enter the B value");
        int B = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print(solution.solve(arr, B));

        sc.close();  // Close the Scanner
    }
}