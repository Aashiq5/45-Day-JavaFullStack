import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ChainedExceptionDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Enter another number:");
        int y = sc.nextInt();
        int z;
        try {
            z = x / y;
        } catch (ArithmeticException ae) {
            NullPointerException nullPointerException = new NullPointerException("Division by zero caused Null point Exception");
            nullPointerException.initCause(ae);
            throw nullPointerException;
        }
        System.out.println(z);

    }
}