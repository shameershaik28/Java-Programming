import java.util.Scanner;

public class RemainingBakeTime {
    //function to handle the remaining time, T is the actual time
    public int timeLeft(int T)
    {
       int TotalTime = 40;
       //edge case
       if(T<0)
       {
           return TotalTime;
       }
       else
        return TotalTime-T; // total time - actual time = remaining Time and it returns back to the main method.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualTime = sc.nextInt();
        RemainingBakeTime rb = new RemainingBakeTime();
        System.out.print(rb.timeLeft(actualTime));
    }
}
