public class Customer {
    private  static long id=1000;
    private String name;
    private String membership;
    private long phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }



    public Customer( String name, String membership, long phone) {
        this.id++;
        this.name = name;
        this.membership = membership;
        this.phone = phone;
    }

    public void printCustomerInfo() {
        System.out.println(id+" "+name+" "+membership+" "+phone);
    }
}
