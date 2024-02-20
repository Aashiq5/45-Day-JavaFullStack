import java.util.*;

public class StackReversal {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        boolean notExit = true;
        Map<String, Integer> map = new HashMap<>();
        while (notExit) {
            System.out.println("1.Input element to stack\n2.reverse the order of elements\n3.Display stack\n4.Exit");
            int n = Integer.parseInt(scanner.nextLine()); // Use nextLine to read the integer
            switch (n) {
                case 1:
                    System.out.println("Enter the Integer to insert into Stack:");
                    int num= Integer.parseInt(scanner.nextLine());
                    inputElement(integerStack,num);
                    break;
                case 2:
                    reverseElements(integerStack);
                    break;
                case 3:
                    displayAllElements(integerStack);
                    break;
                case 4:
                    notExit = false;
                    break;
                default:
                    System.out.println("Invalid input, try again");
                    break;
            }
        }
        scanner.close();
    }

    private static void reverseElements(Stack<Integer> integerStack) {
        Stack<Integer> tempIntegers=new Stack<>();
        while(!integerStack.isEmpty()){
            tempIntegers.push(integerStack.pop());
        }
        integerStack.addAll(tempIntegers);
    }

    private static void inputElement(Stack<Integer> integerStack, int num) {
        integerStack.add(num);
    }

    private static void displayAllElements(Stack<Integer> integerStack) {
        System.out.println(integerStack);
    }







}
