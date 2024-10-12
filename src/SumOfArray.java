import java.util.Scanner;

public class SumOfArray {
    public int Solve(int[] arr)
    {
        int l = arr.length;
        int sum =0;
        for(int i =0; i<l; i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i =0; i<N; i++)
        {
            int A = sc.nextInt();
            arr[i] = A;
        }
        SumOfArray sum = new SumOfArray();
       System.out.print(sum.Solve(arr));
    }
}
