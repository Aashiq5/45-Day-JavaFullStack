public class CustomerController {
    public static void main(String[] args) {
        Customer c1=new Customer("varun","golden",827364834);
        c1.printCustomerInfo();
        Customer c2=new Customer("arun","premium",273481928);
        c2.printCustomerInfo();

        CallCenter.makeCallToCallCenter(c2);

    }
}
