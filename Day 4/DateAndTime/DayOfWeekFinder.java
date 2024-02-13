import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date in YYYY-MM-DD");
        String date=sc.nextLine();
        String[] dates=date.split("-");
        System.out.println(Arrays.toString(dates));
        LocalDate localDate=LocalDate.of(Integer.valueOf(dates[0]),Integer.valueOf(dates[1]),Integer.valueOf(dates[2]));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

    }
}
