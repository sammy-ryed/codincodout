class Vehicle {
    protected String make, model;
    protected int year;
    protected double fuelLevel;

    public Vehicle(String make,String model,int year,double fuelLevel){
        this.make=make; this.model=model; this.year=year; this.fuelLevel=fuelLevel;
    }
    public void startVehicle(){ System.out.println(make+" "+model+" started."); }
    public void stopVehicle(){ System.out.println(make+" "+model+" stopped."); }
    public void refuel(double amount){ fuelLevel+=amount; }
    public void displayVehicleInfo(){ System.out.println(year+" "+make+" "+model+" Fuel:"+fuelLevel); }
}

class Car extends Vehicle {
    public Car(String make,String model,int year,double fuel){ super(make,model,year,fuel); }
}
class Truck extends Vehicle {
    public Truck(String make,String model,int year,double fuel){ super(make,model,year,fuel); }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String make,String model,int year,double fuel){ super(make,model,year,fuel); }
}

public class MainVehicle {
    public static void main(String[] args){
        Vehicle v1=new Car("Toyota","Camry",2019,50);
        Vehicle v2=new Truck("Volvo","FH16",2018,120);
        Vehicle v3=new Motorcycle("Yamaha","R15",2021,15);
        Vehicle[] arr={v1,v2,v3};
        for(Vehicle v: arr){ v.startVehicle(); v.displayVehicleInfo(); }
    }
}