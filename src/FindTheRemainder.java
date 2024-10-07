import java.util.Scanner;

public class FindTheRemainder {
    public void remainderResult(int N1, int N2, int N3)
    {
        if (N1 >= 0 && N1 <= 10000000 && N2 >= 0 && N2 <= 10000000 && N3 >= 1 && N3 <= 10000000)
        {
            int add= N1 + N2; // add both numbers
            int remainder= add%N3; // divide sum + with number 3 to find the remiander
            System.out.println(remainder);
        }
        else System.out.println(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number1=sc.nextInt();
        int Number2=sc.nextInt();
        int Number3=sc.nextInt();

        FindTheRemainder p = new FindTheRemainder();
        p.remainderResult(Number1, Number2, Number3); // pass the arguments to the function
    }
}
