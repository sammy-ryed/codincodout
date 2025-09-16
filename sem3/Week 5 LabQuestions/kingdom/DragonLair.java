package com.example.kingdom;

public class DragonLair {
    private final String dragonType;
    private final long treasureValue;
    private final int territorialRadius;

    public DragonLair(String dragonType, long treasureValue, int territorialRadius) {
        if (dragonType == null || dragonType.isBlank()) throw new IllegalArgumentException("dragonType required");
        if (treasureValue < 0) throw new IllegalArgumentException("treasureValue invalid");
        if (territorialRadius < 0) throw new IllegalArgumentException("territorialRadius invalid");
        this.dragonType = dragonType;
        this.treasureValue = treasureValue;
        this.territorialRadius = territorialRadius;
    }

    public String getDragonType() { return dragonType; }
    public long getTreasureValue() { return treasureValue; }
    public int getTerritorialRadius() { return territorialRadius; }

    @Override
    public String toString() {
        return "DragonLair{" + dragonType + ", treasure=" + treasureValue + ", radius=" + territorialRadius + "}";
    }
}
