class Vehicle {
    static int totalVehicles=0; String vehicleId,brand,model; int year;
    public Vehicle(String id,String brand,String model,int year){ this.vehicleId=id; this.brand=brand; this.model=model; this.year=year; totalVehicles++; }
}

class Car extends Vehicle { public Car(String id,String brand,String model,int year){ super(id,brand,model,year); } }
class Truck extends Vehicle { public Truck(String id,String brand,String model,int year){ super(id,brand,model,year); } }

public class Assignment7_VehicleFleet {
    public static void main(String[] args){
        Car c1=new Car("C1","Toyota","Corolla",2020);
        Truck t1=new Truck("T1","Volvo","FH",2018);
        System.out.println("Total Vehicles:"+Vehicle.totalVehicles);
    }
}