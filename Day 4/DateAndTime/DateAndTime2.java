import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

class DateAndTime1{
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        LocalDate date1=LocalDate.of(2030,2,3);
        LocalDate date2=LocalDate.of(2030, Month.APRIL,3);

        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1=LocalTime.of(6,10);
        LocalTime time2=LocalTime.of(6,20,15);
        LocalTime time3=LocalTime.of(6,20,15,200);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

    }
}