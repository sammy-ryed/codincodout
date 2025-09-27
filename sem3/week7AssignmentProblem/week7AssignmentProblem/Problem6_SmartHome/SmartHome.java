public class SmartHome {
    public static void main(String[] args) {
        Device[] devices = new Device[] {
            new SmartTV("LivingRoomTV"),
            new Thermostat("HallThermo"),
            new SecuritySystem("HomeSafe"),
            new SmartOven("KitchenOven")
        };
        for (Device d : devices) {
            DeviceController.control(d);
            System.out.println();
        }
    }
}

abstract class Device { String id; Device(String id){this.id=id;} abstract void status(); }

class SmartTV extends Device {
    SmartTV(String id){ super(id); }
    void status(){ System.out.println(id + " - TV on channel Netflix."); }
    void setVolume(int v){ System.out.println(id + " - Volume set to " + v); }
}

class Thermostat extends Device {
    Thermostat(String id){ super(id); }
    void status(){ System.out.println(id + " - Temp set to 24°C."); }
    void setTemperature(int t){ System.out.println(id + " - Temperature set to " + t); }
}

class SecuritySystem extends Device {
    SecuritySystem(String id){ super(id); }
    void status(){ System.out.println(id + " - All cameras active."); }
    void armSystem(){ System.out.println(id + " - System armed."); }
}

class SmartOven extends Device {
    SmartOven(String id){ super(id); }
    void status(){ System.out.println(id + " - Oven idle."); }
    void startCooking(String recipe){ System.out.println(id + " - Cooking " + recipe); }
}

class DeviceController {
    static void control(Device d){
        System.out.println("Controlling: " + d.getClass().getSimpleName());
        d.status();
        if (d instanceof SmartTV) {
            SmartTV tv = (SmartTV)d;
            tv.setVolume(15);
        } else if (d instanceof Thermostat) {
            Thermostat th = (Thermostat)d;
            th.setTemperature(22);
        } else if (d instanceof SecuritySystem) {
            SecuritySystem ss = (SecuritySystem)d;
            ss.armSystem();
        } else if (d instanceof SmartOven) {
            SmartOven so = (SmartOven)d;
            so.startCooking("Pizza");
        }
    }
}