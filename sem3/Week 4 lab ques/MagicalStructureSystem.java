abstract class MagicalStructure {
    protected String structureName;
    protected int magicPower;
    protected String location;
    protected boolean isActive;
    public MagicalStructure() { this("Unknown", 10, "Unknown", true); }
    public MagicalStructure(String structureName, int magicPower) { this(structureName, magicPower, "Central", true); }
    public MagicalStructure(String structureName, int magicPower, String location, boolean isActive) {
        this.structureName = structureName;
        this.magicPower = magicPower;
        this.location = location;
        this.isActive = isActive;
    }
    public abstract void castMagicSpell();
}

class WizardTower extends MagicalStructure {
    private int spellCapacity;
    private String[] knownSpells;
    public WizardTower(String name) { super(name, 50); this.spellCapacity = 5; this.knownSpells = new String[]{"Fireball"}; }
    public WizardTower(String name, int spellCapacity) { super(name, 70); this.spellCapacity = spellCapacity; this.knownSpells = new String[]{"Lightning","Shield"}; }
    public void castMagicSpell() { System.out.println(structureName + " casts powerful wizard spell!"); }
}

class EnchantedCastle extends MagicalStructure {
    private int defenseRating;
    private boolean hasDrawbridge;
    public EnchantedCastle(String name) { super(name, 40); this.defenseRating = 100; this.hasDrawbridge = true; }
    public EnchantedCastle(String name, int defense, boolean drawbridge) { super(name, 60); this.defenseRating = defense; this.hasDrawbridge = drawbridge; }
    public void castMagicSpell() { System.out.println(structureName + " radiates defensive aura!"); }
}

class MysticLibrary extends MagicalStructure {
    private int bookCount;
    private String ancientLanguage;
    public MysticLibrary(String name) { super(name, 30); this.bookCount = 100; this.ancientLanguage = "Latin"; }
    public void castMagicSpell() { System.out.println(structureName + " releases knowledge magic!"); }
}

class DragonLair extends MagicalStructure {
    private String dragonType;
    private int treasureValue;
    public DragonLair(String name, String dragonType) { super(name, 80); this.dragonType = dragonType; this.treasureValue = 1000; }
    public void castMagicSpell() { System.out.println(structureName + " unleashes dragon fire!"); }
}

public class MagicalStructureSystem {
    public static boolean canStructuresInteract(MagicalStructure s1, MagicalStructure s2) {
        return s1.isActive && s2.isActive;
    }
    public static String performMagicBattle(MagicalStructure attacker, MagicalStructure defender) {
        if (attacker.magicPower > defender.magicPower) return attacker.structureName + " wins!";
        else if (attacker.magicPower < defender.magicPower) return defender.structureName + " wins!";
        else return "Draw!";
    }
    public static int calculateKingdomMagicPower(MagicalStructure[] structures) {
        int sum = 0;
        for (MagicalStructure x : structures) sum += x.magicPower;
        return sum;
    }
    public static void main(String[] args) {
        MagicalStructure[] structures = {
            new WizardTower("Arcane Spire"),
            new EnchantedCastle("Fort Aegis"),
            new MysticLibrary("Ancient Archives"),
            new DragonLair("Cave of Flames", "Fire Dragon")
        };
        for (MagicalStructure s : structures) s.castMagicSpell();
        System.out.println(performMagicBattle(structures[0], structures[3]));
        System.out.println("Total Magic Power: " + calculateKingdomMagicPower(structures));
    }
}