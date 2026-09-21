package Introduction;
/*
Problem: Print Rhombus

Question:
Print the following pattern in output:

 *
* *
 *

*/

public class PrintRhombus {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++)
        {
            if(i==1 || i==3)
            {
                System.out.println(" *");
            }
            else
                System.out.println("* *");
        }
    }
}
