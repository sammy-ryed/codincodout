public class SmartCampus {
    public static void main(String[] args) {
        Device[] devices = new Device[] {
            new SmartClassroom("Room101"),
            new SmartLab("PhysicsLab"),
            new SmartLibrary("MainLibrary")
        };
        for (Device d : devices) {
            Controller.control(d);
            System.out.println();
        }
    }
}

abstract class Device { String id; Device(String i){ id=i; } abstract void status(); }

class SmartClassroom extends Device {
    SmartClassroom(String id){ super(id); }
    void status(){ System.out.println(id + " - Classroom lights on, AC running."); }
    void projectorOn(){ System.out.println(id + " - Projector started."); }
}

class SmartLab extends Device {
    SmartLab(String id){ super(id); }
    void status(){ System.out.println(id + " - Lab equipment powered."); }
    void safetyCheck(){ System.out.println(id + " - Safety systems online."); }
}

class SmartLibrary extends Device {
    SmartLibrary(String id){ super(id); }
    void status(){ System.out.println(id + " - Library occupancy tracked."); }
    void trackBooks(){ System.out.println(id + " - Books availability updated."); }
}

class Controller {
    static void control(Device d){
        System.out.println("Controlling: " + d.getClass().getSimpleName());
        d.status();
        if (d instanceof SmartClassroom) ((SmartClassroom)d).projectorOn();
        else if (d instanceof SmartLab) ((SmartLab)d).safetyCheck();
        else if (d instanceof SmartLibrary) ((SmartLibrary)d).trackBooks();
    }
}