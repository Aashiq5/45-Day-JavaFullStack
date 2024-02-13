import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class NextDayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date in format yyyy-MM-dd");
        String date = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        System.out.println("Enter the week day (eg. monday,tuesday,wednesday..)");
        String inputWeekDay=sc.nextLine().toUpperCase();
        DayOfWeek desiredWeekDay=DayOfWeek.valueOf(inputWeekDay);
        TemporalAdjuster adjusters=TemporalAdjusters.next(desiredWeekDay);

        LocalDate nextDesiredDayDate=localDate.with(desiredWeekDay);

        System.out.println("Next occurrence of " + desiredWeekDay + " after " + localDate + " is on " + nextDesiredDayDate);

    }
}
