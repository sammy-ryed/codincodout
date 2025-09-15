package com.hospital.patient;

import com.hospital.medical.MedicalRecord;
import java.util.Objects;

/**
 * Patient with private medicalRecord and controlled access levels
 */
public class Patient {
    private final String patientId;
    private final MedicalRecord medicalRecord; // Protected health information (immutable)
    private String currentName;
    private String emergencyContact;
    private String insuranceInfo;
    private int roomNumber;
    private String attendingPhysician;

    // Emergency admission - minimal data, generates temporary ID
    public Patient(String generatedTempId, String name, MedicalRecord medRecord) {
        this.patientId = Objects.requireNonNull(generatedTempId);
        this.currentName = name == null ? "Unknown" : name;
        this.medicalRecord = medRecord; // may be null in truly minimal admission
        this.emergencyContact = null;
        this.insuranceInfo = null;
        this.roomNumber = -1;
        this.attendingPhysician = null;
        validatePrivacy();
    }

    // Standard admission
    public Patient(String patientId, String name, String emergencyContact, String insuranceInfo, MedicalRecord medRecord, int roomNumber, String attendingPhysician) {
        this.patientId = Objects.requireNonNull(patientId);
        this.currentName = name;
        this.emergencyContact = emergencyContact;
        this.insuranceInfo = insuranceInfo;
        this.medicalRecord = medRecord;
        this.roomNumber = roomNumber;
        this.attendingPhysician = attendingPhysician;
        validatePrivacy();
    }

    // Transfer admission (imports existing medical record)
    public Patient(String patientId, MedicalRecord existingRecord) {
        this.patientId = Objects.requireNonNull(patientId);
        this.medicalRecord = existingRecord;
        this.currentName = "Transferred Patient";
        this.emergencyContact = null;
        this.insuranceInfo = null;
        this.roomNumber = -1;
        this.attendingPhysician = null;
        validatePrivacy();
    }

    private void validatePrivacy() {
        // Basic validation rules for demo: patientId not blank; if medicalRecord present, it must have recordId
        if (patientId.isBlank()) throw new IllegalArgumentException("patientId required");
    }

    // Package-private method for hospital staff access
    String getBasicInfo() {
        return "PatientBasic{patientId=" + patientId + ", name=" + currentName + ", room=" + roomNumber + "}";
    }

    // Public method with non-sensitive data
    public String getPublicInfo() {
        return "PublicPatient{name=" + currentName + ", room=" + (roomNumber >= 0 ? roomNumber : "NotAssigned") + "}";
    }

    // Validated setters for modifiable info
    public void setCurrentName(String newName) {
        if (newName != null && !newName.isBlank()) this.currentName = newName;
    }

    public void setEmergencyContact(String contact) {
        this.emergencyContact = contact;
    }

    public void setInsuranceInfo(String info) {
        this.insuranceInfo = info;
    }

    public void setRoomNumber(int room) {
        if (room >= 0) this.roomNumber = room;
    }

    public void setAttendingPhysician(String physician) {
        this.attendingPhysician = physician;
    }

    // Restricted access to medical record - package-private for staff, no public getter for full record
    MedicalRecord getMedicalRecordForStaff() { return medicalRecord; }

    @Override
    public String toString() {
        // Audit trail: includes who edited what could be appended in real system
        return "Patient{patientId=" + patientId + ", name=" + currentName + ", room=" + roomNumber + "}";
    }
}
