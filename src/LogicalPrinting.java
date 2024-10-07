import java.util.Scanner;

public class LogicalPrinting {
    public void solve(int n1, int n2, int n3)
    {
        //calculate the n1 n2 n3 and store it in a variable
        boolean A= (n1 < n2);
        boolean B= (n2 == n3);
        boolean C= A && B;
        System.out.println("Number 1 is "+n1);
        System.out.println("Number 2 is "+n2);
        System.out.println("Number 3 is "+n3);
        System.out.println("(n1 < n2) condition is "+A);
        System.out.println("(n2 == n3) condition is "+B);
        System.out.println("(n1 < n2) && (n2 == n3) condition is " + C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        LogicalPrinting lp = new LogicalPrinting();
        lp.solve(n1, n2, n3);
    }
}
