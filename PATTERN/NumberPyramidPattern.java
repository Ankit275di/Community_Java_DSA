import java.util.Scanner;
public class NumberPyramidPattern {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the limit of Pyramid: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            // for printing the spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // for printing the stars 
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
             // next line
        System.out.println();
        }
    }
}
