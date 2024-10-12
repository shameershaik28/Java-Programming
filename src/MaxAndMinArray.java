import java.util.Scanner;

public class MaxAndMinArray {
    public void MaxMin(int[] arr )
    {
        int l= arr.length;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i =0; i<l;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min= arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N;i++)
        {
            int A = sc.nextInt();
            arr[i] = A;
        }
        MaxAndMinArray obj = new MaxAndMinArray();
        obj.MaxMin(arr);


    }
}
