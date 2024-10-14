import java.util.Arrays;
import java.util.Scanner;

public class RightShiftAnArray {
    public int[] reverse(int[] A, int s, int e)
    {
        int N = A.length;
        while(s<e)
        {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)
        {
           A[i] = sc.nextInt();
        }

        RightShiftAnArray obj = new RightShiftAnArray();
        int s = 0;
        int e =N-1;
       obj.reverse(A, s, e);
       System.out.println(Arrays.toString(obj.reverse(A, s+1, e)));


    }
}
