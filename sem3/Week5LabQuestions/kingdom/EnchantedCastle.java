package com.example.kingdom;

public class EnchantedCastle {
    private final String castleType;
    private int defenseRating;
    private boolean hasDrawbridge;

    public EnchantedCastle(String castleType, int defenseRating, boolean hasDrawbridge) {
        if (castleType == null || castleType.isBlank()) throw new IllegalArgumentException("castleType required");
        this.castleType = castleType;
        this.defenseRating = defenseRating;
        this.hasDrawbridge = hasDrawbridge;
    }

    public String getCastleType() { return castleType; }
    public int getDefenseRating() { return defenseRating; }
    public void setDefenseRating(int defenseRating) { this.defenseRating = defenseRating; }
    public boolean isHasDrawbridge() { return hasDrawbridge; }
    public void setHasDrawbridge(boolean hasDrawbridge) { this.hasDrawbridge = hasDrawbridge; }

    @Override
    public String toString() {
        return "EnchantedCastle{" + castleType + ", defense=" + defenseRating + ", drawbridge=" + hasDrawbridge + "}";
    }
}
