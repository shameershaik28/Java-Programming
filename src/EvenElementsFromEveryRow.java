import java.util.ArrayList;
import java.util.Scanner;

public class EvenElementsFromEveryRow {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
           ArrayList<Integer> row = new ArrayList<>();
          int M =  A.get(i).size();
           for (int j = 0; j < M; j++) {
               int x = A.get(i).get(j);
               if(x%2==0)
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
        System.out.println("Enter the number of rows in the array");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns in the array");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.println("Enter the elements in the array");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < M; j++){
                    row.add(A[i][j]);
            }
            list.add(row);
        }

        EvenElementsFromEveryRow solver = new EvenElementsFromEveryRow();
        System.out.println(solver.solve(list));
    }
}
