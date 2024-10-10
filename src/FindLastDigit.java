import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for(int i =0; i<T;i++)
        {
            int N = sc.nextInt(); // takes the Input value
                int lastDigit = N%10; // it will store the last digit and store it in a variable
                System.out.println(lastDigit);
            }
        }
    }
