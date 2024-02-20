import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultiCatch {
    public static void main(String[] args) {
        try{

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number:");
            int x=sc.nextInt();
            System.out.println("Enter another number:");
            int y=sc.nextInt();
            int z=x/y;
            System.out.println("div of x,y is "+z);

        }catch(Exception ae){
            if(ae instanceof ArithmeticException){
                System.out.println("Arithmetic Exception :"+ae.getMessage());}
            else if(ae instanceof InputMismatchException){
                System.out.println("InputMismatch Exception :"+ae.getMessage());}
            if(ae instanceof ArithmeticException){
                System.out.println("Exception :"+ae.getMessage());}
        }
    }
}