package com.example.virtualpet;

public class DragonPet {
    private final String dragonType;
    private final String breathWeapon;

    private VirtualPet corePet;

    public DragonPet(String dragonType, String breathWeapon, VirtualPet corePet) {
        if (dragonType == null || dragonType.isBlank()) throw new IllegalArgumentException("dragonType required");
        if (breathWeapon == null || breathWeapon.isBlank()) throw new IllegalArgumentException("breathWeapon required");
        if (corePet == null) throw new IllegalArgumentException("corePet required");
        this.dragonType = dragonType;
        this.breathWeapon = breathWeapon;
        this.corePet = corePet;
    }

    // JavaBean style getters - no setters for final fields
    public String getDragonType() { return dragonType; }
    public String getBreathWeapon() { return breathWeapon; }

    // Composition accessor
    public VirtualPet getCorePet() { return corePet; }
    public void setCorePet(VirtualPet corePet) {
        if (corePet == null) throw new IllegalArgumentException("corePet required");
        this.corePet = corePet;
    }

    @Override
    public String toString() {
        return "DragonPet{" +
                "dragonType='" + dragonType + '\'' +
                ", breathWeapon='" + breathWeapon + '\'' +
                ", core=" + corePet.getPetName() +
                '}';
    }
}
