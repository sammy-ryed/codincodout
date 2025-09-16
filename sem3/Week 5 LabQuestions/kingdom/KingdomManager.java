package com.example.kingdom;

import java.util.ArrayList;
import java.util.List;

public class KingdomManager {
    private final List<Object> structures = new ArrayList<>();
    private final KingdomConfig config;

    public KingdomManager(KingdomConfig config) {
        if (config == null) throw new IllegalArgumentException("config required");
        this.config = config;
    }

    public void addStructure(Object s) {
        structures.add(s);
    }

    public static boolean canStructuresInteract(Object s1, Object s2) {
        if (s1 == null || s2 == null) return false;
        // Example rule: WizardTower can interact with MysticLibrary, DragonLair interacts with EnchantedCastle only
        if (s1 instanceof WizardTower && s2 instanceof MysticLibrary) return true;
        if (s2 instanceof WizardTower && s1 instanceof MysticLibrary) return true;
        if (s1 instanceof DragonLair && s2 instanceof EnchantedCastle) return true;
        if (s2 instanceof DragonLair && s1 instanceof EnchantedCastle) return true;
        return false;
    }

    public static String performMagicBattle(Object attacker, Object defender) {
        int aPower = getPowerScore(attacker);
        int dPower = getPowerScore(defender);
        if (aPower > dPower) return "Attacker wins";
        if (dPower > aPower) return "Defender wins";
        return "Draw";
    }

    public static int calculateKingdomPower(Object[] structures) {
        int sum = 0;
        for (Object s : structures) sum += getPowerScore(s);
        return sum;
    }

    private static int getPowerScore(Object s) {
        if (s instanceof WizardTower) return ((WizardTower) s).getMaxSpellCapacity() * 10;
        if (s instanceof EnchantedCastle) return ((EnchantedCastle) s).getDefenseRating() * 5;
        if (s instanceof MysticLibrary) return ((MysticLibrary) s).getKnowledgeLevel() * 8;
        if (s instanceof DragonLair) return (int) Math.min(Integer.MAX_VALUE, ((DragonLair) s).getTreasureValue() / 100);
        if (s instanceof MagicalStructure) return ((MagicalStructure) s).getMagicPower();
        return 0;
    }

    private String determineStructureCategory(Object structure) {
        if (structure instanceof WizardTower) return "WizardTower";
        if (structure instanceof EnchantedCastle) return "EnchantedCastle";
        if (structure instanceof MysticLibrary) return "MysticLibrary";
        if (structure instanceof DragonLair) return "DragonLair";
        if (structure instanceof MagicalStructure) return "MagicalStructure";
        return "Unknown";
    }

    @Override
    public String toString() {
        return "KingdomManager{config=" + config.getKingdomName() + ",structures=" + structures.size() + "}";
    }
}
