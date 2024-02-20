import java.util.Scanner;

public class DayOfTheWeekUsingNew
{
    public static void main(String[] args) {
        String[] week=new String[7];
        week= new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day:");
        int day=sc.nextInt();

        System.out.println(week[day-1]);


    }
}