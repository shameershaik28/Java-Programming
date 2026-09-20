package Introduction;
/*
Problem: Print O

Question:
Print the following pattern in output:

******
*    *
*    *
*    *
******
*/

public class PrintO {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            if(i==1 || i==5)
            {
                System.out.println("******");
            }
            else
            {
                System.out.println("*    *");
            }
        }
    }
}
