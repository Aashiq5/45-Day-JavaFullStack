import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> stringQueue=new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean notExit = true;
        Map<String, Integer> map = new HashMap<>();
        while (notExit) {
            System.out.println("1.Enqueue the element\n2.Dequeue the element\n3.Display all elements\n4.Exit");
            int n = Integer.parseInt(scanner.nextLine()); // Use nextLine to read the integer
            switch (n) {
                case 1:
                    System.out.println("Enter the String to insert into Queue:");
                    String string = scanner.nextLine();
                    enqueue(stringQueue,string);
                    break;
                case 2:
                    dequeue(stringQueue);
                    break;
                case 3:
                    displayAllElements(stringQueue);
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

    private static void displayAllElements(Queue<String> stringQueue) {
        System.out.println(stringQueue);
    }

    private static void dequeue(Queue<String> stringQueue) {
        if (stringQueue.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {

            System.out.println(stringQueue.poll()+" 1Dequeued");
        }
    }
    private static void enqueue(Queue<String> stringQueue, String string) {
        stringQueue.add(string);
        System.out.println("Enqueued");
    }





}
