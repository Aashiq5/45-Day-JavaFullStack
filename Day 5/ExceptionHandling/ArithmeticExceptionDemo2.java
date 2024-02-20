public class ArithmeticExceptionDemo2 {
    public static void main(String[] args) {
     ArithmeticExceptionDemo2 arithmeticExceptionDemo=new ArithmeticExceptionDemo2();
     try {
         arithmeticExceptionDemo.doDivision(40,0);
     }catch (ArithmeticException exception){
         System.out.println("Exception in main: "+exception.getMessage());
     }


    }

    private void doDivision(int x,int y) {

        try{
            int z=x/y;
            System.out.println("division is :"+z);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("exception is: "+exception.getMessage());
        }

        System.out.println("end of the program");

    }
}