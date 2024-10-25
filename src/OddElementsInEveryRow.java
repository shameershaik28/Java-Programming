import java.util.ArrayList;
import java.util.Scanner;

public class OddElementsInEveryRow {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int m = A.get(i).size();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < m; j++) {
                int x = A.get(i).get(j);
                if(x%2!=0)
                {
                    row.add(x);
                }
            }
            ans.add(row);
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        ArrayList<ArrayList<Integer>> oddRows = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < M; j++) {
                row.add(A[i][j]);
            }
            oddRows.add(row);
        }

        OddElementsInEveryRow r = new OddElementsInEveryRow();
        System.out.println(r.solve(oddRows));
    }
}
