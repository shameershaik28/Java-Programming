public class PrintRectangle {
    public static void main(String[] args) {
        for(int i =0; i<4; i++)
        {
            if(i==1 || i==2)
            {
                System.out.println("*        *");
            }
            else {
                System.out.println("**********");
            }
        }
    }
}
