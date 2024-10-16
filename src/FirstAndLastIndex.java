import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastIndex {
    public int[] solve(int[] A, int B) {
        int[] C = new int[]{-1,-1};
        //edge case
     if(A == null || A.length == 0 || B == 0)
    {
       return C;
    }
        int N = A.length;

        for(int i = 0; i < N; i++) {
            if(A[i] == B) {
               C[0]= i;
               break;
            }
        }

        for(int j =N-1; j>=0; j--) {
            if(A[j] == B) {
                C[1]= j;
                break;

            }
        }

        return C;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int N = sc.nextInt();
        System.out.println("Enter the element B :");
        int B = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter the elements in array :");
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        FirstAndLastIndex obj = new FirstAndLastIndex();

        System.out.println(Arrays.toString(obj.solve(arr, B)));

    }
}
