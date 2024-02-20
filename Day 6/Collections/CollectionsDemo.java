import java.util.ArrayList;

class CollectionsDemo{
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<Integer>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        System.out.println(numList);
        numList.remove(new Integer(3));
        System.out.println(numList);

    }
}