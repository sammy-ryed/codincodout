abstract class Vehicle {
    protected int speed;
    protected String fuelType;

    Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    abstract void startEngine();
}

interface Maintainable {
    void serviceInfo();
}

class Car extends Vehicle implements Maintainable {
    private String model;

    Car(int speed, String fuelType, String model) {
        super(speed, fuelType);
        this.model = model;
    }

    void startEngine() {
        System.out.println("Starting car engine of model: " + model);
    }

    public void serviceInfo() {
        System.out.println("Car requires servicing every 6 months.");
    }

    void showDetails() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class LabProblem3_VehicleMaintainable {
    public static void main(String[] args) {
        Car car = new Car(180, "Petrol", "Sedan");
        car.startEngine();
        car.serviceInfo();
        car.showDetails();
    }
}
