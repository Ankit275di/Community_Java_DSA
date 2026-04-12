import java.util.Scanner;
public class FindDuplicateElementInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("FINDING DUPLICATE ELEMENTS FROM AN ARRAY");
        System.out.print("ENTER THE ARRAY SIZE: ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int[sizeOfArray]; 
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0; i<sizeOfArray; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("DISPLAY THE ITEMS AVAILABLE IN ARRAY");
        for(int i=0; i<sizeOfArray; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
