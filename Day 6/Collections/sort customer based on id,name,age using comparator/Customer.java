public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private String address;
    private int age;

    public Customer(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.id, other.id);
    }
}
