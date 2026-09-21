package Introduction;
/*
Problem: Print Rectangle

Question:
Print the following pattern in output:

**********
*        *
*        *
**********
*/

public class PrintRectangle {
    public static void main(String[] args) {

        for(int i=1; i<=4; i++)
        {
            if(i==1 || i==4)
            {
                System.out.println("**********");
            }
            else
                System.out.println("*        *");
        }
    }
}
