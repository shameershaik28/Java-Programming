import java.util.ArrayList;
import java.util.Scanner;

public class AllUniqueElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        if(A.size() == 0) return A;
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

        AllUniqueElements obj = new AllUniqueElements();
       System.out.println(obj.solve(list));


    }
}
