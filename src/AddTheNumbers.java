import java.util.Scanner;

public class AddTheNumbers {
    public void add(int A, int B)
    {
        int sum = A + B;
        System.out.println(sum);
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        AddTheNumbers addTheNumbers = new AddTheNumbers();
        addTheNumbers.add(a, b);
    }
}
