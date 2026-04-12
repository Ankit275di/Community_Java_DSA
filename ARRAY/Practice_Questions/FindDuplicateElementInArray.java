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

        System.out.println("FINDING THE DUPLICATE ITEMS");
        boolean found = false;
        for(int i=0; i<sizeOfArray; i++){
            for(int j=1+i; j<sizeOfArray; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Found Duplicate Item: " + arr[i] + " " + arr[i]);
                    found = true;
                }
            }
        }if(!found){
                    System.out.println("Did not found any elements");
                }

        System.out.println("Lets Add something new algos here");
    }
}
