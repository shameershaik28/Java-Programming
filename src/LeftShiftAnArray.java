import java.util.Scanner;

public class LeftShiftAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Array size should be greater than 0");
            return;
        }

        int[] Arr = new int[N];
        System.out.println("Enter the Original array elements of the array: ");
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }

        int index= Arr[0];


        for(int i =0; i<N-1 ;i++)
        {
            Arr[i]=Arr[i+1];
        }
        Arr[N-1]=index;
        System.out.print("Left Shifted array: ");
        for (int i = 0; i < N; i++) {
           System.out.print(Arr[i]+" ");
        }
    }
}
