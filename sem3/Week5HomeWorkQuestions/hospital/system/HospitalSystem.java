package com.hospital.system;

import com.hospital.patient.Patient;
import com.hospital.staff.Doctor;
import com.hospital.staff.Nurse;
import com.hospital.staff.Administrator;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

/**
 * HospitalSystem demonstrates access control and privacy rules
 */
public class HospitalSystem {
    private final Map<String, Object> patientRegistry = new HashMap<>(); // patientId -> Patient
    public static final int MAX_ROOM_NUMBER = 9999;
    static final String INTERNAL_AUDIT_TAG = "HOSPITAL_INTERNAL";

    public boolean admitPatient(Object patient, Object staff) {
        if (!(patient instanceof Patient)) throw new IllegalArgumentException("patient must be Patient");
        String pid = ((Patient) patient).toString(); // simplified identification
        if (!validateStaffAccess(staff, patient)) {
            // log attempt (omitted)
            return false;
        }
        patientRegistry.put(((Patient) patient).toString(), patient);
        return true;
    }

    private boolean validateStaffAccess(Object staff, Object patient) {
        // Very simplified role validation for demo:
        if (staff instanceof Doctor || staff instanceof Nurse) return true;
        if (staff instanceof Administrator) {
            Administrator admin = (Administrator) staff;
            return admin.hasPermission("ADMIT_PATIENT");
        }
        return false;
    }

    // Package-private internal operation example
    void internalTransferPatient(String fromKey, String toKey) {
        Object p = patientRegistry.remove(fromKey);
        if (p != null) patientRegistry.put(toKey, p);
    }

    public Object lookupPatientById(String key) {
        return patientRegistry.get(key);
    }

    @Override
    public String toString() {
        return "HospitalSystem{patients=" + patientRegistry.size() + "}";
    }

    // Simple demo main
    public static void main(String[] args) {
        System.out.println("HospitalSystem started (demo)"); 
    }
}
