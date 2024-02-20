import java.util.Comparator;

class CustomerNameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c2.getName().compareTo(c1.getName());
    }
}

class CustomerAgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c1.getAge(), c2.getAge());
    }
}

class CustomerIdComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c1.getId(), c2.getId());
    }
}
