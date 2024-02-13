public interface IVehicle{
    void start();
    void move();
    void stop();

}

class Bike implements IVehicle{

    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void move() {
        System.out.println("Bike Moving");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped");
    }


    }
class Bus implements IVehicle{

    @Override
    public void start() {
        System.out.println("Bus Started");
    }

    @Override
    public void move() {
        System.out.println("Bus Moving");
    }

    @Override
    public void stop() {
        System.out.println("Bus Stopped");
    }


}
class Car implements IVehicle{

    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void move() {
        System.out.println("Car Moving");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }


}
class VehicleAgent{
    public void giveVehicle(IVehicle vehicle){
        vehicle.start();
        vehicle.move();
        vehicle.stop();
    }
}

class CustomerMain{
    public void requestVehicle(){
        VehicleAgent agent=new VehicleAgent();

        IVehicle bike = new Bike();
        IVehicle bus = new Bus();
        IVehicle car = new Car();

        System.out.println("Customer requesting a bike:");
        agent.giveVehicle(bike);

        System.out.println("\nCustomer requesting a bus:");
        agent.giveVehicle(bus);

        System.out.println("\nCustomer requesting a car:");
        agent.giveVehicle(car);
    }

    public static void main(String[] args) {
        CustomerMain customer = new CustomerMain();
        customer.requestVehicle();
    }
}