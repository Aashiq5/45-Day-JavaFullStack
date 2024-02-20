import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer(103, "Ruban", "Chennai", 40));
        customerList.add(new Customer(105, "MuthuKumaran", "Madurai", 28));
        customerList.add(new Customer(102, "Jaffar", "Coimbatore", 25));
        customerList.add(new Customer(106, "Venkat", "Trichy", 32));
        customerList.add(new Customer(101, "jayaprakash", "Salem", 30));
        customerList.add(new Customer(104, "Ashik", "Tirunelveli", 35));

        customerList.sort(new CustomerIdComparator());
        System.out.println("\n Sorted by ID:");
        customerList.forEach(x-> System.out.println(x.getId()+" "+x.getName()+" "+x.getAge()));

        customerList.sort(new CustomerNameComparator());
        System.out.println("\n Reverse Sorted by Name:");
        customerList.forEach(x-> System.out.println(x.getName()+" "+x.getId()+" "+x.getAge()));

        customerList.sort(new CustomerAgeComparator());
        System.out.println("\n Sorted by Age:");
        customerList.forEach(x-> System.out.println(x.getAge()+" "+x.getId()+" "+x.getName()));
    }
}