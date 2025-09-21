
// 🧪 HW PROBLEM 3: Game and Card Game Objects
import java.util.Objects;

class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return Objects.equals(name, game.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class CardGame extends Game {
    private int numberOfCards;

    public CardGame(String name, int numberOfCards) {
        super(name);
        this.numberOfCards = numberOfCards;
    }

    @Override
    public String toString() {
        return super.toString() + ", CardGame with " + numberOfCards + " cards";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardGame)) return false;
        if (!super.equals(o)) return false;
        CardGame that = (CardGame) o;
        return numberOfCards == that.numberOfCards;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfCards);
    }
}

class GameTest {
    public static void main(String[] args) {
        CardGame c1 = new CardGame("Poker", 52);
        CardGame c2 = new CardGame("Poker", 52);
        System.out.println(c1.toString());
        System.out.println("Equals? " + c1.equals(c2));
    }
}
