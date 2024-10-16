import java.util.Scanner;

public class GreaterThanB {
    public int solve(int[] A, int B) {
        if(A==null || A.length==0)
            return 0;
        int N = A.length;
        int count =0;
        for(int i =0; i<N ; i++)
        {
            if(A[i] > B)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        System.out.println("Enter an Element B");
        int B = sc.nextInt();

        int[] arr = new int[N];

        for(int i =0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }

        GreaterThanB gb = new GreaterThanB();
       System.out.println(gb.solve(arr, B));


    }
}
