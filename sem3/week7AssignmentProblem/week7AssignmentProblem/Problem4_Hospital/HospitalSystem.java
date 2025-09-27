public class HospitalSystem {
    public static void main(String[] args) {
        MedicalStaff[] roster = new MedicalStaff[] {
            new Doctor("Dr. A", "Cardiology"),
            new Nurse("Nurse B", "Ward 3"),
            new Technician("Tech C", "Radiology"),
            new Administrator("Admin D", "Front Desk")
        };
        for (MedicalStaff m : roster) {
            m.shiftSchedule();
            m.idCardAccess();
            m.payroll();
            // downcast to call specialty methods when needed
            if (m instanceof Doctor) ((Doctor)m).diagnose();
            if (m instanceof Nurse) ((Nurse)m).administerMedicine();
            System.out.println();
        }
    }
}

class MedicalStaff {
    String name;
    MedicalStaff(String n){ name=n; }
    void shiftSchedule(){ System.out.println(name + " - Shift scheduled."); }
    void idCardAccess(){ System.out.println(name + " - ID access OK."); }
    void payroll(){ System.out.println(name + " - Payroll processed."); }
}

class Doctor extends MedicalStaff {
    String specialty;
    Doctor(String n, String s){ super(n); specialty=s; }
    void diagnose(){ System.out.println(name + " diagnoses patients in " + specialty); }
    void prescribe(){ System.out.println(name + " prescribes medication."); }
    void performSurgery(){ System.out.println(name + " performs surgery."); }
}

class Nurse extends MedicalStaff {
    String ward;
    Nurse(String n, String w){ super(n); ward=w; }
    void administerMedicine(){ System.out.println(name + " administers medicine in " + ward); }
    void monitor(){ System.out.println(name + " monitors patients."); }
}

class Technician extends MedicalStaff {
    String dept;
    Technician(String n, String d){ super(n); dept=d; }
    void operateEquipment(){ System.out.println(name + " operates equipment in " + dept); }
}

class Administrator extends MedicalStaff {
    String area;
    Administrator(String n, String a){ super(n); area=a; }
    void scheduleAppointments(){ System.out.println(name + " schedules appointments in " + area); }
}