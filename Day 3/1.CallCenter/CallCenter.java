public class CallCenter {
    public static void makeCallToCallCenter(Customer c) {
        pickUpCall();
        if(c.getMembership().equals("premium")){
            allotTime(15);
        }
        else if(c.getMembership().equals("golden")){
            allotTime(10);
        }
        else{
            allotTime(5);
        }
        hangCall();
    }

    public static void pickUpCall(){
        System.out.println("Started Serving customer");
    }
    public static void allotTime(int time){
        System.out.println("Alloted time "+time+" mins for customers");
    }
    public static void hangCall(){
        System.out.println("Service over to customer");
    }


}
