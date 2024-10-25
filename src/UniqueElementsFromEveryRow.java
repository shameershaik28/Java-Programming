import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElementsFromEveryRow {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int N= A.size(); // take the row size
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // create a new array for the result

        for(int i=0; i<N; i++){
            ArrayList<Integer>ar=new ArrayList<>(); // create an arraylist for every arraylist row
            int m=A.get(i).size(); // take the arraylist size of every row
            for(int j=0; j<m; j++){
                int number=A.get(i).get(j); // take the value
                int count=0;
                for(int k=0; k<m; k++){ // traverse arraylist in the row
                    if(number==A.get(i).get(k)){
                        count++;
                    }
                }
                if(count==1){
                    ar.add(A.get(i).get(j));
                }
            }
            ans.add(ar);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns in the array");
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        System.out.println("Enter the elements in the array");
        for(int i = 0; i < N; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < M; j++){
                row.add(sc.nextInt());
            }
            A.add(row);
        }

        //System.out.println(A.size());

        UniqueElementsFromEveryRow r = new UniqueElementsFromEveryRow();
        System.out.println(r.solve(A));
    }
}
