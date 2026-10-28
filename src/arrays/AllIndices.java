package arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class AllIndices {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A.get(i).equals(B)) {
                arr.add(i);
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

        int B = sc.nextInt();

        ArrayList<Integer> result = solve(A, B);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));

            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}

