import java.time.LocalDate;
import java.time.Month;

public class DiffInDates {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2003, Month.FEBRUARY, 6);
        LocalDate today = LocalDate.now();

        System.out.println("Years: " + (today.getYear() - dob.getYear()));
        System.out.println("Months: " + (today.getMonthValue() - dob.getMonthValue()));
        System.out.println("Days: " + (today.getDayOfMonth() - dob.getDayOfMonth()));
    }
}
