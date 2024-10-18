import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueElementsIncreasingOrder {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        if(A.isEmpty()) return A;
        int N = A.size();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0; i<N; i++)
        {
            int ele= A.get(i);
            int count =0;
            for(int j = 0; j<N; j++)
            {
                if(A.get(j)== ele)
                {
                    count++;
                }
            }
            if(count==1)
                ans.add(ele);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();


        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        UniqueElementsIncreasingOrder obj = new UniqueElementsIncreasingOrder();
        System.out.println(obj.solve(list));


    }
    }
