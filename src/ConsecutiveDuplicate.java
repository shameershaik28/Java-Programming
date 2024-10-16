import java.util.Scanner;

public class ConsecutiveDuplicate {
    public static boolean solve(int arr[]) {
        if(arr == null || arr.length == 0) {
            return false;
        }
           int n = arr.length;

           for(int i =0; i<n-1 ; i++)
           {
                if(arr[i]==arr[i+1])
               {
                   return true;
               }
           }
           return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        int [] arr = new int[N];

System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        ConsecutiveDuplicate.solve(arr);
        System.out.println(solve(arr));
    }
}
