import java.util.Scanner;
public class tempCodeRunner{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello");

        tempCodeRunner t1 = new tempCodeRunner();
        t1.helloName();
        t1.addNums();
    }

    void helloName(){
        System.out.println("My Name is Anku");
    }

    void addNums(){
        System.out.print("All Nums Added: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1+num2;
        System.out.print("The Sum of 2 nums: " + num3);
    }
}