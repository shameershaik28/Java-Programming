import java.util.ArrayList;
import java.util.Scanner;

public class AllEvenNumbers {
   public ArrayList<Integer> solve(ArrayList<Integer> A) {
      if(A.isEmpty()) return A;
      int N = A.size();

      ArrayList<Integer> B = new ArrayList<>();

      for(int i = 0; i < N; i++){
         if(A.get(i) % 2 == 0){
            B.add(A.get(i));
         }
      }
      return B;
   }
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of the array: ");
   int N = sc.nextInt();
      ArrayList<Integer> A = new ArrayList<>();

      System.out.println("Enter the elements of the array: ");
      for(int i = 0; i < N; i++){
         A.add(sc.nextInt());
      }
      ArrayList<Integer> B = new ArrayList<>();

      for(int i = 0; i < N; i++){
         if(A.get(i) % 2 == 0){
            B.add(A.get(i));
         }
      }
      AllEvenNumbers obj = new AllEvenNumbers();
      System.out.println(obj.solve(A));

   }
}
