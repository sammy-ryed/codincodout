// File: GameBattle.java
public class GameBattle {

    // Basic attack
    public void attack(int damage) {
        System.out.println("Basic attack for " + damage + " points!");
    }

    // Attack with weapon
    public void attack(int damage, String weapon) {
        System.out.println("Attacking with " + weapon + " for " + damage + " points!");
    }

    // Critical attack
    public void attack(int damage, String weapon, boolean isCritical) {
        if (isCritical) {
            System.out.println("CRITICAL HIT! " + weapon + " deals " + (damage * 2) + " points!");
        } else {
            attack(damage, weapon);
        }
    }

    // Team attack
    public void attack(int damage, String[] teammates) {
        int totalDamage = damage * teammates.length;
        System.out.print("Team attack with ");
        for (int x = 0; x < teammates.length; x++) {
            System.out.print(teammates[x]);
            if (x != teammates.length - 1) System.out.print(", ");
        }
        System.out.println(" for " + totalDamage + " total damage!");
    }

    public static void main(String[] args) {
        GameBattle battle = new GameBattle();

        battle.attack(50); // Basic attack
        battle.attack(75, "Sword"); // Weapon attack
        battle.attack(60, "Bow", true); // Critical attack
        battle.attack(40, new String[]{"Alice", "Bob"}); // Team attack
    }
}
