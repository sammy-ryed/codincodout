package com.example.virtualpet;

public class RobotPet {

    private boolean needsCharging;
    private int batteryLevel; // 0-100

    private VirtualPet corePet;

    public RobotPet(VirtualPet corePet) {
        this(corePet, true, 100);
    }

    public RobotPet(VirtualPet corePet, boolean needsCharging, int batteryLevel) {
        if (corePet == null) throw new IllegalArgumentException("corePet required");
        validateBattery(batteryLevel);
        this.corePet = corePet;
        this.needsCharging = needsCharging;
        this.batteryLevel = batteryLevel;
    }

    public boolean isNeedsCharging() { return needsCharging; }
    public void setNeedsCharging(boolean needsCharging) { this.needsCharging = needsCharging; }

    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { validateBattery(batteryLevel); this.batteryLevel = batteryLevel; }

    public VirtualPet getCorePet() { return corePet; }
    public void setCorePet(VirtualPet corePet) {
        if (corePet == null) throw new IllegalArgumentException("corePet required");
        this.corePet = corePet;
    }

    private void validateBattery(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) throw new IllegalArgumentException("battery out of range");
    }

    @Override
    public String toString() {
        return "RobotPet{" +
                "needsCharging=" + needsCharging +
                ", batteryLevel=" + batteryLevel +
                ", core=" + corePet.getPetName() +
                '}';
    }
}
