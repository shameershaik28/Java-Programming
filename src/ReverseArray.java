import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public int[] reverseArray(int[] arr)
    {
        int M = arr.length;

        int[] newArray= new int[M];

        for(int i=0; i<M; i++)
        {
            newArray[i]= arr[M-i-1];
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] array1 = new int[N];

        for(int i = 0; i < N; i++)
        {
            array1[i] = sc.nextInt();
        }

        ReverseArray obj = new ReverseArray();
        // Use Arrays.toString() to print the reversed array
        System.out.println(Arrays.toString(obj.reverseArray(array1)));
    }
}