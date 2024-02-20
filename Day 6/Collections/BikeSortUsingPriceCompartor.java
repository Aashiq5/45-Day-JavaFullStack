import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Bike implements Comparable<Bike> {
    private String model;
    private int price;

    public Bike(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Bike otherBike) {
        // Compare bikes based on price
        return Integer.compare(this.price, otherBike.price);
    }

    public String toString() {
        return "Bike [model=" + model + ", price=" + price + "]";
    }
}


class BikeMain {
    public static void main(String[] args) {
        List<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike("Mountain Bike", 500));
        bikes.add(new Bike("Road Bike", 700));
        bikes.add(new Bike("Electric Bike", 1000));

        System.out.println("Bikes before sorting:");
        for (Bike bike : bikes) {
            System.out.println(bike);
        }

        Collections.sort(bikes);

        System.out.println("\nBikes after sorting based on price:");
        for (Bike bike : bikes) {
            System.out.println(bike);
        }
    }
}
