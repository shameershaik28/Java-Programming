import java.util.Scanner;

public class StrictlyDecreasing {
    public int solve(int[] A) {
        int N = A.length;
        for(int i = 0; i < N-1; i++){

            if(A[i]<=A[i+1])
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        int[] arr = new int[N];
System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        StrictlyDecreasing obj = new StrictlyDecreasing();
        System.out.println(obj.solve(arr));
    }
}
