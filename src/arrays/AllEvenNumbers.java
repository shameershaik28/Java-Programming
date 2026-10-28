package arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class AllEvenNumbers {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                arr.add(A.get(i));
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        ArrayList<Integer> result = solve(A);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));

            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

