package com.example.kingdom;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class KingdomConfig {
    private final String kingdomName;
    private final int foundingYear;
    private final String[] allowedStructureTypes;
    private final Map<String, Integer> resourceLimits;

    public static KingdomConfig createDefaultKingdom() {
        Map<String,Integer> limits = new HashMap<>();
        limits.put("gold", 10000);
        limits.put("mana", 5000);
        return new KingdomConfig("Avalon", 1024, new String[]{"WizardTower","EnchantedCastle","MysticLibrary","DragonLair"}, limits);
    }

    public static KingdomConfig createFromTemplate(String type) {
        if ("fortress".equalsIgnoreCase(type)) {
            Map<String,Integer> limits = new HashMap<>();
            limits.put("gold", 50000);
            limits.put("mana", 2000);
            return new KingdomConfig("FortressTemplate", 1100, new String[]{"EnchantedCastle","DragonLair"}, limits);
        }
        return createDefaultKingdom();
    }

    public KingdomConfig(String kingdomName, int foundingYear, String[] allowedStructureTypes, Map<String,Integer> resourceLimits) {
        if (kingdomName == null || kingdomName.isBlank()) throw new IllegalArgumentException("kingdomName required");
        if (foundingYear <= 0) throw new IllegalArgumentException("foundingYear invalid");
        if (allowedStructureTypes == null || allowedStructureTypes.length == 0) throw new IllegalArgumentException("allowedStructureTypes required");
        if (resourceLimits == null) throw new IllegalArgumentException("resourceLimits required");

        this.kingdomName = kingdomName;
        this.foundingYear = foundingYear;
        this.allowedStructureTypes = Arrays.copyOf(allowedStructureTypes, allowedStructureTypes.length);
        this.resourceLimits = Collections.unmodifiableMap(new HashMap<>(resourceLimits));
    }

    public String getKingdomName() { return kingdomName; }
    public int getFoundingYear() { return foundingYear; }
    public String[] getAllowedStructureTypes() { return Arrays.copyOf(allowedStructureTypes, allowedStructureTypes.length); }
    public Map<String,Integer> getResourceLimits() { return new HashMap<>(resourceLimits); }

    @Override
    public String toString() {
        return "KingdomConfig{" +
                "kingdomName='" + kingdomName + '\'' +
                ", foundingYear=" + foundingYear +
                ", allowedStructureTypes=" + Arrays.toString(allowedStructureTypes) +
                ", resourceLimits=" + resourceLimits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KingdomConfig that = (KingdomConfig) o;
        return foundingYear == that.foundingYear &&
                kingdomName.equals(that.kingdomName) &&
                Arrays.equals(allowedStructureTypes, that.allowedStructureTypes) &&
                resourceLimits.equals(that.resourceLimits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(kingdomName, foundingYear, resourceLimits);
        result = 31 * result + Arrays.hashCode(allowedStructureTypes);
        return result;
    }
}
