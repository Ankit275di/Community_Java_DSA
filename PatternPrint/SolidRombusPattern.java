public class SolidRombusPattern {
    public static void main(String[] args) {
        int n=5;
        // rombus
        for(int i=1; i<=n; i++){
            // prints the space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // prints starts
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
