import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfSets
{
    public static void main(String[] args) {
        HashSet<Integer> integers1=new HashSet<Integer>();
        HashSet<Integer> integers2=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maxsize of set1");
        int maxSizeofSet1= sc.nextInt();
        System.out.println("Enter set1 numbers");
        while(integers1.size()<maxSizeofSet1&&sc.hasNextInt()){
            int num1=sc.nextInt();
            integers1.add(num1);
        }
        System.out.println("Enter maxsize of set2");
        int maxSizeofSet2= sc.nextInt();
        System.out.println("Enter set2 numbers");
        while(integers2.size()<maxSizeofSet2&&sc.hasNextInt()){
            int num2=sc.nextInt();
            integers2.add(num2);
        }
        //to find intersection
        HashSet<Integer> intersection=new HashSet<Integer>(integers1);
        intersection.retainAll(integers2);
        System.out.println("The intersection of two sets are "+intersection);


    }
}