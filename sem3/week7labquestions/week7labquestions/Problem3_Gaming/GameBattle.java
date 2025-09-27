public class GameBattle {
    public static void main(String[] args) {
        Character[] army = new Character[] {
            new Warrior("Thor"),
            new Mage("Merlin"),
            new Archer("Legolas")
        };
        for (Character c : army) {
            c.attack();
            System.out.println();
        }
    }
}

abstract class Character { String name; Character(String n){ name=n; } abstract void attack(); }

class Warrior extends Character {
    Warrior(String n){ super(n); }
    @Override void attack(){ System.out.println(name + " swings sword with high defense!"); }
}

class Mage extends Character {
    Mage(String n){ super(n); }
    @Override void attack(){ System.out.println(name + " casts a fireball using mana!"); }
}

class Archer extends Character {
    Archer(String n){ super(n); }
    @Override void attack(){ System.out.println(name + " shoots an arrow with long-range damage!"); }
}