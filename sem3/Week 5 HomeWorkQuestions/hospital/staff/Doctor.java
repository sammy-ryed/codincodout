package com.hospital.staff;

import com.hospital.patient.Patient;
import com.hospital.medical.MedicalRecord;
import java.util.Set;
import java.util.Objects;

/**
 * Doctor with specific access level
 */
public class Doctor {
    private final String licenseNumber;
    private final String specialty;
    private final Set<String> certifications;

    public Doctor(String licenseNumber, String specialty, Set<String> certifications) {
        this.licenseNumber = Objects.requireNonNull(licenseNumber);
        this.specialty = specialty;
        this.certifications = certifications;
    }

    // Doctors can view basic patient info and medical records
    public String viewBasicInfo(Patient p) {
        return p.getBasicInfo();
    }

    public MedicalRecord viewMedicalRecord(Patient p) {
        return p.getMedicalRecordForStaff();
    }

    @Override
    public String toString() {
        return "Doctor{license=" + licenseNumber + ", specialty=" + specialty + "}";
    }
}
