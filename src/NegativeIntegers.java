import java.util.Scanner;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        if(N <=0 || N> 1000)
        {
            System.out.println("Invalid Input");
        }

        int[] arr = new int[N];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++)
        {
            if(arr[i] < 0)
            {
                System.out.print(arr[i]+" ");
            }

        }



    }
}
