public class TransportDispatch {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[] {
            new Bus("Route 42", 50),
            new Taxi("TX-100", 12.5),
            new Train("Blue Line", 8),
            new Bike("Dock-7")
        };
        for (Vehicle v : fleet) {
            Dispatcher.dispatch(v, "Pickup at Main St");
            System.out.println();
        }
    }
}

abstract class Vehicle { String id; Vehicle(String id){this.id=id;} abstract void operate(String request); }

class Bus extends Vehicle {
    int capacity;
    Bus(String route, int capacity){ super(route); this.capacity=capacity; }
    @Override void operate(String req){ System.out.println("Bus on " + id + " servicing request: " + req + " | Capacity: " + capacity); }
}

class Taxi extends Vehicle {
    double farePerKm = 10;
    double distance;
    Taxi(String id, double distance){ super(id); this.distance=distance; }
    @Override void operate(String req){ System.out.println("Taxi " + id + " going to " + req + " | Estimated fare: " + (farePerKm * distance)); }
}

class Train extends Vehicle {
    int cars;
    Train(String line, int cars){ super(line); this.cars=cars; }
    @Override void operate(String req){ System.out.println("Train " + id + " scheduled for " + req + " | Cars: " + cars); }
}

class Bike extends Vehicle {
    Bike(String dock){ super(dock); }
    @Override void operate(String req){ System.out.println("Bike from " + id + " is available for short trip: " + req); }
}

class Dispatcher {
    static void dispatch(Vehicle v, String request){
        System.out.println("Dispatching to: " + v.getClass().getSimpleName());
        v.operate(request);
    }
}