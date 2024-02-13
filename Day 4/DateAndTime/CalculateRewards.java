import java.time.Period;

public class CalculateRewards
{
    public static void main(String[] args) {
        int noOfRewards=findRewards(60,24,Period.ofDays(90));
        System.out.println("No of Rewards: "+noOfRewards);

        Period period=Period.ofMonths(2);

        System.out.println("The Days are "+period.getDays());
        System.out.println("The Months are "+period.getMonths());
        System.out.println("The years are "+period.getYears());



    }

    private static int findRewards(int noOfTasks, int completedTasks, Period period) {
        //if all completed,give 10 rewards
        //if 75% completed ,give 8  rewards
        //if 50% completed ,give 4 rewards
        //if 30% completed ,give 2rewards
        if(completedTasks==noOfTasks){
            return 10;
        } else if (noOfTasks*0.75<=completedTasks) {
            return 8;
        }else if (noOfTasks*0.75<=completedTasks) {
            return 4;
        }else if (noOfTasks*0.75<=completedTasks) {
            return 2;
        }
        return 0;
    }
}
