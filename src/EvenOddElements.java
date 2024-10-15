import java.util.Scanner;

public class EvenOddElements {
    public static void solve(int[] A) {
        int N = A.length;
        int even = 0;
        int odd = 0;
        for (int k = 0; k < N; k++) {
            if (A[k] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int sum = even - odd;

        if (sum < 0) {
            sum = sum * -1;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if(T<1 || T>10)
        {
            return;
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {

                arr[j] = sc.nextInt();
            }
            solve(arr);
        }
    }
}
