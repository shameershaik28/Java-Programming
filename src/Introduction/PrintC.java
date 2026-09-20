package Introduction;

/*
Problem: Print C

Question:
Print the following pattern in output:

******
*
*
*
******

*/

public class PrintC {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            if(i==2 || i==3 || i==4)
            {
                System.out.println("*");
            }
            else
            {
                System.out.println("******");
            }
        }
    }
}
