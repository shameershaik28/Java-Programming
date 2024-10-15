import java.util.Arrays;
import java.util.Scanner;

public class PrintInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i =N-1; i>=0; i--){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
