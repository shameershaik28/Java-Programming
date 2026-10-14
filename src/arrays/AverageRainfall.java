package arrays;


import java.util.Scanner;

public class AverageRainfall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / N;
        int result = (int) Math.floor(avg);

        System.out.println(result);

        sc.close();
    }
}

