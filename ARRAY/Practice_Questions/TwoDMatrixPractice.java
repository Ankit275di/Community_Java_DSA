import java.util.Scanner;

public class TwoDMatrixPractice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int rows = 2;
        int cols = 2;

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
        
        System.out.print("Enter the Key Element: ");
        int key = sc.nextInt();

        System.out.println("Searching Technoque in Matrix: ");
        TwoDMatrixPractice t1 = new TwoDMatrixPractice();
        int result = t1.isFound(arr1,rows,cols,key);
        if(result != -1){
            System.out.println(result);
        }
        else{
            System.out.println("Element not Found at any index");
        }
    }   
    
    public static int isFound(int arr[][], int r, int c, int key){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == key){
                    System.out.println("Index No: " + i + " & " + j);
                    return 1;
                }
            }
        }
        return -1;
    }
}
