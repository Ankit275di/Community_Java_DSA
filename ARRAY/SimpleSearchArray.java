import java.util.Scanner;
public class SimpleSearchArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Size of Array: ");
        int arrS = sc.nextInt();

        int arr[] = new int[arrS];

        for(int i=0; i<arrS; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the Key Value: ");
        int target = sc.nextInt();

        SimpleSearchArray obj1 = new SimpleSearchArray();

        int result = obj1.isFound(arr, target);

        if(result!=-1){
            System.out.println("Key Found at Index: " + result);
        }
        else{
            System.out.println("Key Not Found ...");
        }


    }

    public int isFound(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
