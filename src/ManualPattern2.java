public class ManualPattern2 {
    public static void main(String[] args) {

        int N=5;
        for(int i=0; i<N; i++){
            for(int j=0; j<N-1-i; j++){
                System.out.print(" ");
            }
            for(int j=N-1; j>=N-1-i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

