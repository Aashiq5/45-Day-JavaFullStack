import java.util.InputMismatchException;
import java.util.Scanner;

public class CorrectInputHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0 ;
        boolean numChecker = false;

        do {
            try {
                System.out.println("Enter the number :");
                num = sc.nextInt();
                numChecker = true;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // clear the invalid input
            }
        } while (!numChecker);

        System.out.println("Number : " + num);

        
    }
}
