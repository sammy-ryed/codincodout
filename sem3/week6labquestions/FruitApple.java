
// 🧪 LAB PROBLEM 1: Fruit and Apple Inheritance
class Fruit {
    protected String color;
    protected String taste;

    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }
}

class Apple extends Fruit {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste);
        this.variety = variety;
    }

    public void display() {
        System.out.println("Apple variety: " + variety + ", Color: " + color + ", Taste: " + taste);
    }
}

class FruitTest {
    public static void main(String[] args) {
        Apple a = new Apple("Red", "Sweet", "Fuji");
        a.display();
    }
}
