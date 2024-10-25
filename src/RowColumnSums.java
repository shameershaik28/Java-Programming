import java.util.ArrayList;
import java.util.Scanner;

public class RowColumnSums {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        int M = A.get(0).size();

        ArrayList<Integer> ans = new ArrayList<>();

        // Calculate row sums
        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = 0; j < M; j++){ // Changed from N to M
                int x = A.get(i).get(j);
                sum += x;
            }
            ans.add(sum);
        }

        // Calculate column sums
        for(int j = 0; j < M; j++){
            int sum = 0;
            for(int i = 0; i < N; i++){
                int x = A.get(i).get(j);
                sum += x;
            }
            ans.add(sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                row.add(sc.nextInt());
            }
            list.add(row);
        }

        RowColumnSums r = new RowColumnSums();
        System.out.println(r.solve(list));
    }
}
