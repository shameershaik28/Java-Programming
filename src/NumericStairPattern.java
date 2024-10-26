import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumericStairPattern {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> stairs = new ArrayList<>();
        for (int i = 1; i <=A; i++) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int j = 1; j <=i; j++) {
                ans.add(j);
            }
            stairs.add(ans);
        }
        return stairs;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            NumericStairPattern nsp = new NumericStairPattern();
            System.out.println(nsp.solve(A));
        }
    }

