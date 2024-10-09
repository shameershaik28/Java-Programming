import java.util.Scanner;

public class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //edge case
        if(N==0 || N >10000000)
        {
            return;
        }
        //Iterating from N to 1
        for(int i =N; i>=1; i--){
            System.out.print(i+" ");
        }
        }

    }
