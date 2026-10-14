package arrays;

import java.util.Scanner;

public class ProductOfElements {

    public static long solve(int[] arr) {
        long product = 1;

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr));

        sc.close();
    }
}
