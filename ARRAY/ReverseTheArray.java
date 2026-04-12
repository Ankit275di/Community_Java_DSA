import java.util.Scanner;
public class ReverseTheArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the Array Elements: ");
        int arr[] = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed Array: ");
        for(int i=4; i>=0; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
