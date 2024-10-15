import java.util.Scanner;

public class PairCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        System.out.println("Enter the value of the array: ");
        int B = sc.nextInt();


        int[] arr = new int[N];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < N; i++)
        {
            for(int j= 0; j < N; j++)
            {
                if(arr[i]+arr[j] == B && i!=j)
                {
                    count++;
                }
            }
        }
        System.out.println(count/2);

    }
}
