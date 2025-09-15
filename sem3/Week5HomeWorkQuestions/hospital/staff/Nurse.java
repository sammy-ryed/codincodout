package com.hospital.staff;

import com.hospital.patient.Patient;
import java.util.List;
import java.util.Objects;

/**
 * Nurse class with limited access
 */
public class Nurse {
    private final String nurseId;
    private final String shift;
    private final List<String> qualifications;

    public Nurse(String nurseId, String shift, List<String> qualifications) {
        this.nurseId = Objects.requireNonNull(nurseId);
        this.shift = shift;
        this.qualifications = qualifications;
    }

    // Nurses can view basic info but not full medical DNA; may access medical record for assigned patients (omitted)
    public String viewBasicInfo(Patient p) {
        return p.getBasicInfo();
    }

    @Override
    public String toString() {
        return "Nurse{id=" + nurseId + ", shift=" + shift + "}";
    }
}
