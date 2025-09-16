package com.example.kingdom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WizardTower {
    private final int maxSpellCapacity;
    private final List<String> knownSpells;
    private String currentWizard;

    public WizardTower(int maxSpellCapacity, List<String> knownSpells, String currentWizard) {
        if (maxSpellCapacity <= 0) throw new IllegalArgumentException("capacity positive");
        this.maxSpellCapacity = maxSpellCapacity;
        this.knownSpells = new ArrayList<>(knownSpells == null ? Collections.emptyList() : knownSpells);
        this.currentWizard = currentWizard;
    }

    // Factory variations
    public static WizardTower emptyTower() {
        return new WizardTower(10, Collections.emptyList(), null);
    }

    public static WizardTower basicTower() {
        return new WizardTower(50, List.of("Lumos","Shield"), "Apprentice");
    }

    public static WizardTower fullyEquipped() {
        return new WizardTower(200, List.of("Fireball","Teleport","TimeWarp"), "Archmage");
    }

    public int getMaxSpellCapacity() { return maxSpellCapacity; }
    public List<String> getKnownSpells() { return Collections.unmodifiableList(knownSpells); }

    public String getCurrentWizard() { return currentWizard; }
    public void setCurrentWizard(String currentWizard) { this.currentWizard = currentWizard; }

    @Override
    public String toString() {
        return "WizardTower{" + "capacity=" + maxSpellCapacity + ", spells=" + knownSpells + ", wizard=" + currentWizard + "}";
    }
}
