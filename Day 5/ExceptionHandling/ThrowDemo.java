import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number:");
            int x=sc.nextInt();
            System.out.println("Enter another number:");
            int y=sc.nextInt();
            try {
                if(y==0){
                    throw new ArithmeticException("y value must be non zero");
                }
                int z = x / y;
                System.out.println("div of x,y is " + z);
            }catch(ArithmeticException ae){
                System.out.println("exception is: "+ae.getMessage());
            }

    }
}