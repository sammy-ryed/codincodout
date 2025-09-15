package com.example.virtualpet;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class VirtualPet {
    private final String petId;
    private final PetSpecies species;
    private final long birthTimestamp;

    private String petName;
    private int age;
    private int happiness;
    private int health;

    protected static final String[] DEFAULT_EVOLUTION_STAGES = {"Egg", "Young", "Adult", "Elder"};
    static final int MAX_HAPPINESS = 100;
    static final int MAX_HEALTH = 100;

    public static final String PET_SYSTEM_VERSION = "2.0";

    // Default constructor: random pet with default species
    public VirtualPet() {
        this("Pet-" + new Random().nextInt(10000), PetSpecies.createDefaultSpecies(), 0, 50, 50);
    }

    // Constructor with name only
    public VirtualPet(String name) {
        this(name, PetSpecies.createDefaultSpecies(), 0, 60, 60);
    }

    // Constructor with name and species
    public VirtualPet(String name, PetSpecies species) {
        this(name, species, 0, 60, 60);
    }

    // Main constructor
    public VirtualPet(String name, PetSpecies species, int age, int happiness, int health) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name required");
        if (species == null) throw new IllegalArgumentException("Species required");
        validateStat(happiness);
        validateStat(health);
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");

        this.petId = generatePetId();
        this.petName = name;
        this.species = species;
        this.birthTimestamp = System.currentTimeMillis();
        this.age = age;
        this.happiness = happiness;
        this.health = health;
    }

    // JavaBean getters/setters
    public String getPetId() { return petId; }
    public PetSpecies getSpecies() { return species; }
    public long getBirthTimestamp() { return birthTimestamp; }

    public String getPetName() { return petName; }
    public void setPetName(String petName) {
        if (petName == null || petName.isBlank()) throw new IllegalArgumentException("Invalid name");
        this.petName = petName;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public int getHappiness() { return happiness; }
    public void setHappiness(int happiness) {
        validateStat(happiness);
        this.happiness = happiness;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) {
        validateStat(health);
        this.health = health;
    }

    // Public interface
    public void feedPet(String foodType) {
        int bonus = calculateFoodBonus(foodType);
        modifyHealth(bonus/2);
        modifyHappiness(bonus);
        checkEvolution();
    }

    public void playWithPet(String gameType) {
        int effect = calculateGameEffect(gameType);
        modifyHappiness(effect);
        modifyHealth(-Math.max(0, 5 - effect/10));
        checkEvolution();
    }

    // Protected internal calculations
    protected int calculateFoodBonus(String foodType) {
        if (foodType == null) return 5;
        switch(foodType.toLowerCase()) {
            case "treat": return 20;
            case "fruit": return 10;
            case "meat": return 25;
            default: return 5;
        }
    }

    protected int calculateGameEffect(String gameType) {
        if (gameType == null) return 5;
        switch(gameType.toLowerCase()) {
            case "fetch": return 15;
            case "dance": return 10;
            case "battle": return 25;
            default: return 5;
        }
    }

    // Private helpers
    private void modifyHappiness(int delta) {
        this.happiness = Math.max(0, Math.min(MAX_HAPPINESS, this.happiness + delta));
    }

    private void modifyHealth(int delta) {
        this.health = Math.max(0, Math.min(MAX_HEALTH, this.health + delta));
    }

    private void checkEvolution() {
        updateEvolutionStage();
    }

    private void updateEvolutionStage() {
        int stage = (int) Math.floor((double) age / Math.max(1, species.getMaxLifespan()/ (DEFAULT_EVOLUTION_STAGES.length)));
        // purely illustrative -- no exposed state for evolution stage; could be extended
    }

    String getInternalState() { // package-private for debugging
        return String.format("VirtualPet[id=%s,name=%s,species=%s,age=%d,happiness=%d,health=%d]",
            petId, petName, species.getSpeciesName(), age, happiness, health);
    }

    // Private utilities
    private void validateStat(int stat) {
        if (stat < 0 || stat > 100) throw new IllegalArgumentException("Stat out of range");
    }

    private String generatePetId() {
        return "VP-" + UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "VirtualPet{" +
                "petId='" + petId + '\'' +
                ", species=" + species.getSpeciesName() +
                ", birthTimestamp=" + birthTimestamp +
                ", petName='" + petName + '\'' +
                ", age=" + age +
                ", happiness=" + happiness +
                ", health=" + health +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualPet that = (VirtualPet) o;
        return Objects.equals(petId, that.petId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petId);
    }
}
