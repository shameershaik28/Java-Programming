import java.util.Scanner;

public class TotalElapsedCookingTime {
    public void TimeSpent(int L, int P )
    {
        //Edge Cases
        if((L>=1 && L<=20) && (P>=0 && P<= 40)){
            int Layers = L * 2;   // calculate the total layers time with 2
            int result = Layers + P; // calculate the total layers time with preparation time
            System.out.println(result);
        }
        else
            System.out.println("Invalid Inputs");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int layersTime = sc.nextInt(); //each layers Time is 2 minutes
        int preparationTime = sc.nextInt(); // Time spent making lasagna in oven in minutes

        TotalElapsedCookingTime t = new TotalElapsedCookingTime(); // use the object to call the function
        t.TimeSpent(layersTime, preparationTime); //  pass the arguments to the function to calculate the result.
    }
}
