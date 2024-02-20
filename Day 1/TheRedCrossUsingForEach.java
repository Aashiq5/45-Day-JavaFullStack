import java.util.Scanner;

class TheRedCross{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfTents;
        System.out.println("Enter no of tents: ");
        noOfTents=sc.nextInt();
        int [] noOfRefugees=new int[noOfTents];
        System.out.println("Enter no of refugees in each tent");
        for(int i=0;i<noOfRefugees.length;i++){
            noOfRefugees[i]=sc.nextInt();
        }
        int totalRefugees=0;
        for(int numRefugees : noOfRefugees){
            totalRefugees += numRefugees;
        }
        System.out.println("Total Refugees "+totalRefugees);

    }
}