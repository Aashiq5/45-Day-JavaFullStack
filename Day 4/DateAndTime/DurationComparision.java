import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DurationComparision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter DateTime 1 (format:yyyy-MM-dd HH:mm:ss):");
        String inputDate1=sc.nextLine();
        System.out.println("Enter DateTime 1 (format:yyyy-MM-dd HH:mm:ss):");
        String inputDate2=sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime1=LocalDateTime.parse(inputDate1,formatter);
        LocalDateTime localDateTime2=LocalDateTime.parse(inputDate2,formatter);
        Duration duration=Duration.between(localDateTime1,localDateTime2);

        long days=duration.toDays();
        long hours=duration.toHours();
        long minutes=duration.toMinutes();
        long seconds=duration.toSeconds();

        System.out.println("The duration is "+days+" days, "+hours+" hours, "+minutes+" minutes and "+seconds+".");


    }
}
