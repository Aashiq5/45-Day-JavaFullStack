import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DataFormat {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("actual date "+localDate);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        String formattedLocalDate=localDate.format(dateTimeFormatter);
        System.out.println("FORMATTED DATE: "+formattedLocalDate);

        DateTimeFormatter fullDateFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String germanLocalDate=localDate.format(fullDateFormatter);
        System.out.println("GERMAN FORMATTED DATE: "+germanLocalDate);

    }
}
