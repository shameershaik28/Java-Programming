import java.util.Scanner;

public class RemainingBakeTime {
    public int timeLeft(int T)
    {
       int TotalTime = 40;
       if(T<0)
       {
           return TotalTime;
       }
       else
        return TotalTime-T;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualTime = sc.nextInt();
        RemainingBakeTime rb = new RemainingBakeTime();
        System.out.print(rb.timeLeft(actualTime));
    }
}