public class Car {
    String brand, model, color;
    int year;
    boolean isRunning;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isRunning = false;
    }
    public void startEngine() { isRunning = true; System.out.println(brand+" "+model+" engine started."); }
    public void stopEngine() { isRunning = false; System.out.println(brand+" "+model+" engine stopped."); }
    public void displayInfo() { System.out.println(year+" "+color+" "+brand+" "+model+" Running:"+isRunning); }
    public int getAge(int currentYear) { return currentYear-year; }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota","Corolla",2018,"Red");
        Car c2 = new Car("Honda","Civic",2020,"Blue");
        Car c3 = new Car("Ford","Mustang",2015,"Black");
        c1.startEngine(); c1.displayInfo();
        c2.stopEngine(); c2.displayInfo();
        c3.displayInfo();
        System.out.println("Car1 Age:"+c1.getAge(2025));
    }
}