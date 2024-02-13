import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaylightSavingTimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in format yyyy-MM-dd");
        String date = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        ZoneId zoneId = ZoneId.of("America/New_York");  // Use the time zone of a country that observes DST
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate.atStartOfDay(), zoneId);

        boolean isDST = zoneId.getRules().isDaylightSavings(zonedDateTime.toInstant());
        System.out.println("Is the date during Daylight Saving Time? " + isDST);

        //dst starts on mar 11 2024 and ends on nov 4 2024
    }
}
