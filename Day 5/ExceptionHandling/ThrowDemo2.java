import java.util.Scanner;

public class ThrowDemo2 {
    public static void m3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int x=sc.nextInt();
        System.out.println("Enter another number:");
        int y=sc.nextInt();
        try {
            if(y==0){
                throw new ArithmeticException("y value must be non zero");
            }
            int z = x / y;
            System.out.println("div of x,y is " + z);
        }catch(ArithmeticException ae){
            System.out.println("exception is: "+ae.getMessage());
            throw ae;
        }
    }
    public static void m2(){
            m3();
    }
    public static void main(String[] args) {
           try{m2();}
           catch (ArithmeticException ae){
               System.out.println("In main exception: "+ae.getMessage());
           }


    }
}