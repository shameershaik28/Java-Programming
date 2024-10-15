import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void solve(int[] A, int B){
        int[] newArray = new int[A.length];

        for(int i = 0; i < A.length; i++){
            newArray[i]= A[i]+B;
        }

        System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B= sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        solve(arr,B);
    }
}
