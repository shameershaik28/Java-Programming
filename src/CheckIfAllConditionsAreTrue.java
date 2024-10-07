import java.util.Scanner;

public class CheckIfAllConditionsAreTrue {
    public void solve(int n1, int n2, int n3)
    {
        //calculate and  print ( n1 < 50)&&(n2 > n3)&&(1 <= n3)
        System.out.println("Number 1 is "+n1);
        System.out.println("Number 2 is "+n2);
        System.out.println("Number 3 is "+n3);
        System.out.println(( n1 < 50)&&(n2 > n3)&&(1 <= n3));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        CheckIfAllConditionsAreTrue check = new CheckIfAllConditionsAreTrue();
        check.solve(n1, n2, n3);
    }
}
