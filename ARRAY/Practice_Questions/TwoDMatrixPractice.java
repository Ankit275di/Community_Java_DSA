import java.util.Scanner;

public class TwoDMatrixPractice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;

        int[][] arr1 = new int[rows][cols];

        System.out.println("Enter the Matrix Items: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying the Matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
