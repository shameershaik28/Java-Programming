package arrays;


import java.util.Scanner;

public class FirstMultiple {

    public static int first_multiple(int[] ls, int x) {
        int N = ls.length;

        for (int i = 0; i < N; i++) {
            if (ls[i] % x == 0) {
                return ls[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] ls = new int[N];

        for (int i = 0; i < N; i++) {
            ls[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(first_multiple(ls, x));

        sc.close();
    }
}

