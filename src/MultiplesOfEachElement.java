import java.util.ArrayList;
import java.util.Scanner;

public class MultiplesOfEachElement {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int j = 0; j < m; j++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++)
            {
                if(A.get(i) % B.get(j) == 0)
                    temp.add(A.get(i));
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            B.add(sc.nextInt());
        }

        MultiplesOfEachElement me = new MultiplesOfEachElement();
        System.out.println(me.solve(A, B));

    }
}
