import java.util.Scanner;

class StudentPassOrFail{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] marks=new int[6];
        String[] num= new String[]{"one", "two", "three", "four", "five", "all"};
        System.out.println("Enter 6 Subjects Marks:");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        int i=6;
        int countOfFail=0;
        while(i-->0){
            if (marks[i]<45){
                countOfFail+=1;
            }
        }
        if (countOfFail==0){
            System.out.println("Student passed in all Subjects");
        } else if (countOfFail==1) {
            System.out.println("Student failed in "+num[countOfFail-1]+" Subject");
        } else{
            System.out.println("Student failed in "+num[countOfFail-1]+" Subjects ");
        }

    }
}