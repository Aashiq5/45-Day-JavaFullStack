import java.util.Arrays;
import java.util.Scanner;

class SortAges{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nums=new int[6];
       // String[] num= new String[]{"one", "two", "three", "four", "five", "all"};
        System.out.println("Enter  six numbers:");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int sumOfOddPositions=0;
        for(int i=0;i<nums.length;i+=2){
            sumOfOddPositions+=nums[i];
        }
        System.out.println("Sum of Odd Positions "+sumOfOddPositions);


    }


}