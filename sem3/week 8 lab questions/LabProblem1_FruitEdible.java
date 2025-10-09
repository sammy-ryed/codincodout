abstract class Fruit {
    protected String color;
    protected String taste;

    Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    abstract void showDetails();
}

interface Edible {
    void nutrientsInfo();
}

class Apple extends Fruit implements Edible {
    private String variety;

    Apple(String color, String taste, String variety) {
        super(color, taste);
        this.variety = variety;
    }

    void showDetails() {
        System.out.println("Fruit: Apple");
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Variety: " + variety);
    }

    public void nutrientsInfo() {
        System.out.println("Rich in fiber and vitamin C.");
    }
}

public class LabProblem1_FruitEdible {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet", "Fuji");
        apple.showDetails();
        apple.nutrientsInfo();
    }
}
