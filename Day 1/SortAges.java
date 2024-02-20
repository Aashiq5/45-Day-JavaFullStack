import java.util.Arrays;
import java.util.Scanner;

class SortAges{
    static void insertionSort(int[] arr){
        for(int i=1;i< arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ages=new int[6];
       // String[] num= new String[]{"one", "two", "three", "four", "five", "all"};
        System.out.println("Enter age of six students:");
        for(int i=0;i<ages.length;i++){
            ages[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        printAges(ages);
        System.out.println("After Sorting");
        insertionSort(ages);
        printAges(ages);

    }

    private static void printAges(int[] ages) {
        System.out.println(Arrays.toString(ages));
    }
}