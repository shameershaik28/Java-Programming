import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //Edge case
        if(N<2 || N>100)
        {
            return;
        }

                //This is iterate for N times
                for(int i=N; i>=1; i--)
                {
                    //it will print  until i
                    for(int k =1; k<=i; k++)
                    {
                        System.out.print("*");
                    }

                    //it calculate and print spaces
                    for(int s=1; s<=(2*(N-i)); s++)
                    {
                        System.out.print(" ");
                    }

                    //it will print  until i
                    for(int k =1; k<=i; k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
        }
