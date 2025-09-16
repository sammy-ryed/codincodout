package com.hospital.medical;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * Immutable MedicalRecord - final class, defensive copies, HIPAA validation
 */
public final class MedicalRecord {
    private final String recordId;
    private final String patientDNA;
    private final String[] allergies;
    private final String[] medicalHistory;
    private final LocalDate birthDate;
    private final String bloodType;

    public MedicalRecord(String recordId, String patientDNA, String[] allergies, String[] medicalHistory,
                         LocalDate birthDate, String bloodType) {
        // HIPAA-style simple validation: no nulls, reasonable lengths, minimal checks
        Objects.requireNonNull(recordId, "recordId required");
        Objects.requireNonNull(patientDNA, "patientDNA required");
        Objects.requireNonNull(birthDate, "birthDate required");
        if (recordId.isBlank()) throw new IllegalArgumentException("recordId cannot be blank");
        if (patientDNA.length() < 10) throw new IllegalArgumentException("patientDNA suspiciously short");
        this.recordId = recordId;
        this.patientDNA = patientDNA;
        this.birthDate = birthDate;
        this.bloodType = bloodType == null ? "UNKNOWN" : bloodType;
        this.allergies = allergies == null ? new String[0] : Arrays.copyOf(allergies, allergies.length);
        this.medicalHistory = medicalHistory == null ? new String[0] : Arrays.copyOf(medicalHistory, medicalHistory.length);
    }

    // Only getters, defensive copies for arrays to maintain immutability
    public String getRecordId() { return recordId; }
    public String getPatientDNA() { return patientDNA; } // sensitive but read-only
    public LocalDate getBirthDate() { return birthDate; }
    public String getBloodType() { return bloodType; }
    public String[] getAllergies() { return Arrays.copyOf(allergies, allergies.length); }
    public String[] getMedicalHistory() { return Arrays.copyOf(medicalHistory, medicalHistory.length); }

    // Cannot be overridden for safety
    public final boolean isAllergicTo(String substance) {
        if (substance == null) return false;
        for (String a : allergies) if (substance.equalsIgnoreCase(a)) return true;
        return false;
    }

    @Override
    public String toString() {
        // Audit-friendly, not exposing DNA or full history
        return "MedicalRecord{recordId=" + recordId + ", birthDate=" + birthDate + ", bloodType=" + bloodType + ", allergiesCount=" + allergies.length + "}";
    }
}
