import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int T = sc.nextInt();
        if(T<1 || T>10)
        {
            System.out.println("Number of test cases must be between 1 and 10");
        }

        for(int i =0; i<T; i++)
        {
            System.out.println("Enter the size of the array : ");
            int N = sc.nextInt();
            int[]  arr = new int[N];

            System.out.println("Enter the elements of the array : ");
            for(int j =0; j<N ; j++)
            {
                arr[j] = sc.nextInt();
            }

            for(int k=0; k<N; k++) {
                if (arr[k] % 2 == 0) {
                    System.out.print("Even Values"+ arr[k] + " ");
                }
            }

            System.out.println();
            for(int k=0; k<N; k++) {
                if (arr[k]%2==1){
                   System.out.print("Odd Values" + arr[k]+" ");
                }
            }
            System.out.println();
        }
    }
}
