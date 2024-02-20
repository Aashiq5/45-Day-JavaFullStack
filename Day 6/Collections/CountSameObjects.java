import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSameObjects {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>(Arrays.asList(new String[]{"apple", "mango", "apple", "grapes", "banana"}));
        System.out.println(fruitList);
        System.out.println("No of fruits: " + fruitList.size());

        if (fruitList.contains("mango")) {
            System.out.println("mango is present");
        } else {
            System.out.println("mango is not present");
        }
        if (fruitList.contains("grapes")) {
            int idx = fruitList.indexOf("grapes");
            fruitList.set(idx, "watermelon");
        }
        System.out.println(fruitList);
        fruitList.remove("mango");

       /* fruitList.removeIf(fruit -> fruit.equals("mango"));*/
        System.out.println(fruitList);
        ArrayList<String> fruitList2=new ArrayList<>(fruitList);

        fruitList.remove(1);
        System.out.println(fruitList);
        fruitList.remove(2);
        System.out.println(fruitList);


        fruitList2.removeAll(fruitList);
        System.out.println(fruitList2);
    }
}
