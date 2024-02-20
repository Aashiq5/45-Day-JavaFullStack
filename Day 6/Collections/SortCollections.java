import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
     ArrayList<Integer> numList=new ArrayList<>();
     numList.add(100);
     numList.add(20);
     numList.add(70);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);

        Integer[] numArr=new Integer[numList.size()];
        numList.toArray(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
