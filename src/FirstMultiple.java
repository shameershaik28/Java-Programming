import java.util.Scanner;

public class FirstMultiple {
    public static int first_multiple(int[] ls, int x) {
        if (ls==null || ls.length ==0 || x == 0) {
            System.out.println("Invalid input:");
            return -1;
        }

        int multiple  = -1;
        for (int i = 0; i < ls.length; i++) {
            if (ls[i] % x == 0) {
                multiple = ls[i];
                break;
            }
        }
        return multiple  ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        System.out.println("Enter the element x ");
        int x = sc.nextInt();

        int[] ls = new int[N];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < N; i++)
        {
            ls[i] = sc.nextInt();
        }


       System.out.println( first_multiple(ls, x));

    }
}
