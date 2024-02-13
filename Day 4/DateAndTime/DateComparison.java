import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DateComparison{
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date in YYYY-MM-DD");
        String date=sc.nextLine();
        String[] dates=date.split("-");
        LocalDate enteredDate=LocalDate.of(Integer.valueOf(dates[0]),Integer.valueOf(dates[1]),Integer.valueOf(dates[2]));
        if(enteredDate.isBefore(today)){
            System.out.println(enteredDate+" was in past");
        }else{
            System.out.println(enteredDate+" will be future ");
        }

    }
}
