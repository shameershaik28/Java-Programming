import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
        {
            return;
        }

        int[] arr = new int[N];

        for(int i =0; i<=N-1; i++)
        {
            arr[i] = sc.nextInt();
        }

        long sum = 1;

        for(int i =0; i<=N-1; i++)
        {
            sum*= arr[i];
        }

        System.out.println(sum);
    }
}
