import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter y");
        int y=sc.nextInt();
        try{
            int z=x/y;
            System.out.println("division is :"+z);
        }
        catch (ArithmeticException exception){
            System.out.println("exception is: "+exception.getMessage());
        }

        System.out.println("end of the program");

    }
}