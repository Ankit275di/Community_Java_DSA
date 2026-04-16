import java.util.Arrays;
import java.util.Scanner;
public class FindDuplicateItemAndDel{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Displaying the items: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         
        Arrays.sort(arr);
        System.out.println("Sorted Array Displaying: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}