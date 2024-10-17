import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] inverse = new int[N];

        for(int i = 0; i < N; i++){
            inverse[arr[i]]= i;
        }
System.out.println("The inverse array is: ");
        System.out.println(Arrays.toString(inverse));
    }
}
