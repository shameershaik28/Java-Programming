package arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibilityChecker {

    public static List<Integer> divisible(List<Integer> A) {
        int N = A.size();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A.get(i) % 5 == 0 && A.get(i) % 7 == 0) {
                arr.add(A.get(i));
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        List<Integer> result = divisible(A);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));

            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

