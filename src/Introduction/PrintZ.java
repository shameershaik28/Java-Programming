package Introduction;
/*

Question:
Print the following pattern in output:

*****
   *
  *
 *
*****
*/

public class PrintZ {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            if(i==1 || i==5)
            {
                System.out.println("*****");
            }
            else if(i==2)
            {
                System.out.println("   *");
            }
            else if(i==3)
            {
                System.out.println("  *");
            }
            else if(i==4)
            {
                System.out.println(" *");
            }
        }
    }
}
