package Introduction;
/*
Problem: Print S

Question:
Print the following pattern in output:

******
*
*
******
     *
     *
******
*/

public class PrintS {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++)
        {
            if(i==1 || i==4|| i==7)
            {
                System.out.println("******");
            }
            else if(i==2 || i== 3)
            {
                System.out.println("*");
            }
            else if(i==5 || i==6)
            {
                System.out.println("     *");
            }
        }
    }
}
