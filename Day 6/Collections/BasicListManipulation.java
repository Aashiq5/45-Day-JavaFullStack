import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicListManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        boolean notExit = true;

        while (notExit) {
            System.out.println("1.Add an element to list\n2.Remove an element from list\n3.Find the index of specific element\n4.Display all elements in list\n5.Exit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter number to be added");
                    int numToAdd = sc.nextInt();
                    addElement(numToAdd, integerList);
                    break;
                case 2:
                    System.out.println("Enter number to be removed");
                    int numToRemove = sc.nextInt();
                    removeElement(numToRemove, integerList);
                    break;
                case 3:
                    System.out.println("Enter number to find its first index");
                    int numToFind = sc.nextInt();
                    findElement(numToFind, integerList);
                    break;
                case 4:
                    displayAllElements(integerList);
                    break;
                case 5:
                    notExit = false;
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid Input, Enter Again");
                    break;
            }
        }
    }

    private static void displayAllElements(List<Integer> integerList) {
        if (integerList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Elements in the list: " + integerList);
        }
    }

    private static void findElement(int numToFind, List<Integer> integerList) {
        int index = integerList.indexOf(numToFind);
        if (index != -1) {
            System.out.println("First index of " + numToFind + " in the list: " + index);
        } else {
            System.out.println(numToFind + " is not found in the list.");
        }
    }

    private static void removeElement(int numToRemove, List<Integer> integerList) {
        boolean removed = integerList.remove(Integer.valueOf(numToRemove));
        if (removed) {
            System.out.println(numToRemove + " has been removed from the list.");
        } else {
            System.out.println(numToRemove + " is not found in the list.");
        }
    }

    private static void addElement(int num, List<Integer> integerList) {
        integerList.add(num);
        System.out.println(num + " has been added to the list.");
    }
}
