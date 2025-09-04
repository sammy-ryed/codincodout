import java.util.*;

public class VirtualPet {
    private final String petId;
    private String petName;
    private String species;
    private int age;
    private int happiness;
    private int health;
    private String stage;
    private static final String[] EVOLUTION_STAGES = {"Egg", "Baby", "Child", "Teen", "Adult", "Elder"};
    private static int totalPetsCreated = 0;

    public VirtualPet() {
        this("Mystery", randomSpecies(), 0, 50, 50, EVOLUTION_STAGES[0]);
    }
    public VirtualPet(String petName) {
        this(petName, randomSpecies(), 1, 60, 60, EVOLUTION_STAGES[1]);
    }
    public VirtualPet(String petName, String species) {
        this(petName, species, 3, 70, 70, EVOLUTION_STAGES[2]);
    }
    public VirtualPet(String petName, String species, int age, int happiness, int health, String stage) {
        this.petId = generatePetId();
        this.petName = petName;
        this.species = species;
        this.age = age;
        this.happiness = happiness;
        this.health = health;
        this.stage = stage;
        totalPetsCreated++;
    }
    private static String randomSpecies() {
        String[] s = {"Dragon", "Phoenix", "Wolf", "Cat"};
        return s[new Random().nextInt(s.length)];
    }
    private static String generatePetId() {
        return UUID.randomUUID().toString();
    }
    public void feedPet() { happiness = Math.min(100, happiness + 10); health = Math.min(100, health + 5); }
    public void playWithPet() { happiness = Math.min(100, happiness + 15); health = Math.max(0, health - 2); }
    public void healPet() { health = Math.min(100, health + 20); }
    public void simulateDay() {
        age++;
        happiness = Math.max(0, happiness - new Random().nextInt(5));
        health = Math.max(0, health - new Random().nextInt(5));
        evolvePet();
    }
    private void evolvePet() {
        if (health == 0) { stage = "Ghost"; return; }
        if (age < 2) stage = EVOLUTION_STAGES[0];
        else if (age < 4) stage = EVOLUTION_STAGES[1];
        else if (age < 6) stage = EVOLUTION_STAGES[2];
        else if (age < 8) stage = EVOLUTION_STAGES[3];
        else if (age < 12) stage = EVOLUTION_STAGES[4];
        else stage = EVOLUTION_STAGES[5];
    }
    public String getPetStatus() {
        return petName + " (" + species + ") Stage: " + stage + " Age: " + age + " Happiness: " + happiness + " Health: " + health;
    }
    public static void main(String[] args) {
        List<VirtualPet> pets = new ArrayList<>();
        pets.add(new VirtualPet());
        pets.add(new VirtualPet("Buddy"));
        pets.add(new VirtualPet("Spark", "Dragon"));
        for (int d = 0; d < 5; d++) {
            System.out.println("Day " + (d+1));
            for (VirtualPet p : pets) {
                p.simulateDay();
                System.out.println(p.getPetStatus());
            }
        }
        System.out.println("Total Pets: " + totalPetsCreated);
    }
}