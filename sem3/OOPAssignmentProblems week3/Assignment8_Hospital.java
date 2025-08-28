class Patient {
    static int totalPatients=0; String patientId,patientName; public Patient(String id,String name){ this.patientId=id; this.patientName=name; totalPatients++; }
}
class Doctor {
    static int totalDoctors=0; String doctorId,doctorName; public Doctor(String id,String name){ this.doctorId=id; this.doctorName=name; totalDoctors++; }
}
class Appointment {
    static int totalAppointments=0; String appointmentId; Patient p; Doctor d; public Appointment(String id,Patient p,Doctor d){ this.appointmentId=id; this.p=p; this.d=d; totalAppointments++; }
}

public class Assignment8_Hospital {
    public static void main(String[] args){
        Patient p1=new Patient("P1","Alice"); Doctor d1=new Doctor("D1","Dr. John");
        Appointment a1=new Appointment("A1",p1,d1);
        System.out.println("Patient:"+p1.patientName+" Doctor:"+d1.doctorName+" Appointment:"+a1.appointmentId);
        System.out.println("Total Patients:"+Patient.totalPatients+" Appointments:"+Appointment.totalAppointments);
    }
}