import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestElement {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      System.out.print("FINDING SECOND LARGEST NUMBER");
      int sizeOfArr = sc.nextInt();

      int arr[] = new int[sizeOfArr];
      System.out.print("ENTER THE ARRAY ELEMENTS");
      for(int i=0; i<sizeOfArr; i++){
         arr[i] = sc.nextInt();
      }

      // sorting algo applying 
      Arrays.sort(arr);
      System.out.println("DISPLAYING THE SORTED DATA");
      for(int i=0; i<sizeOfArr; i++){
         System.out.print(" " + arr[i]);
      }

      // /displaying the second largest number
      System.out.print("DISPLAYING THE SECOND LARGEST NUMBER: " + arr[2]);
   }
}
