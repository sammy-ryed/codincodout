package com.example.virtualpet;

import java.util.Arrays;
import java.util.Objects;

public final class PetSpecies {
    private final String speciesName;
    private final String[] evolutionStages;
    private final int maxLifespan;
    private final String habitat;

    public PetSpecies(String speciesName, String[] evolutionStages, int maxLifespan, String habitat) {
        if (speciesName == null || speciesName.isBlank()) throw new IllegalArgumentException("speciesName required");
        if (evolutionStages == null || evolutionStages.length == 0) throw new IllegalArgumentException("evolutionStages required");
        for (String s : evolutionStages) if (s == null || s.isBlank()) throw new IllegalArgumentException("invalid evolution stage");
        if (maxLifespan <= 0) throw new IllegalArgumentException("maxLifespan must be positive");
        if (habitat == null || habitat.isBlank()) throw new IllegalArgumentException("habitat required");

        this.speciesName = speciesName;
        this.evolutionStages = Arrays.copyOf(evolutionStages, evolutionStages.length);
        this.maxLifespan = maxLifespan;
        this.habitat = habitat;
    }

    public String getSpeciesName() { return speciesName; }
    public String[] getEvolutionStages() { return Arrays.copyOf(evolutionStages, evolutionStages.length); }
    public int getMaxLifespan() { return maxLifespan; }
    public String getHabitat() { return habitat; }

    public static PetSpecies createDefaultSpecies() {
        return new PetSpecies("Fenix", new String[]{"Egg","Chick","Fledgling","Adult"}, 20, "Forest");
    }

    @Override
    public String toString() {
        return "PetSpecies{" +
                "speciesName='" + speciesName + '\'' +
                ", evolutionStages=" + Arrays.toString(evolutionStages) +
                ", maxLifespan=" + maxLifespan +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PetSpecies)) return false;
        PetSpecies that = (PetSpecies) o;
        return maxLifespan == that.maxLifespan &&
                speciesName.equals(that.speciesName) &&
                habitat.equals(that.habitat) &&
                Arrays.equals(evolutionStages, that.evolutionStages);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(speciesName, maxLifespan, habitat);
        result = 31 * result + Arrays.hashCode(evolutionStages);
        return result;
    }
}
