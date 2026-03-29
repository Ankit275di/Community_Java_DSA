
import java.util.Scanner;

public class FactorialOfNumberMethod {
    static Scanner sc = new Scanner(System.in);
    
    public void factorial(int num){
        int factorials = 1;
        for(int i=num; i>=1; i--){
            factorials = factorials*i;
        }
        System.out.println("Factorial: "+factorials);
    }

    public static void main(String args[]){
        FactorialOfNumberMethod f1 = new FactorialOfNumberMethod();

        int num = sc.nextInt();

        f1.factorial(num);
    }
}
