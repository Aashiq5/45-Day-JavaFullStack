import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class TimeZones {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Define source and target time zones
        ZoneId sourceZone = ZoneId.of("America/New_York");
        ZoneId targetZone = ZoneId.of("Asia/Kolkata");

        // Convert the current date to the source time zone
        ZonedDateTime sourceDateTime = currentDate.atStartOfDay(sourceZone);
        System.out.println("Date and time in source time zone: " + sourceDateTime);

        // Convert the date and time to the target time zone
        ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(targetZone);
        System.out.println("Date and time in target time zone: " + targetDateTime);

        // Format the date and time in the target time zone
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String formattedDate = formatter.format(targetDateTime);
        System.out.println("Formatted date in target time zone: " + formattedDate);
    }
}
