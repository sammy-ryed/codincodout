
// 🧪 HW PROBLEM 4: Food Preparation Template
abstract class Food {
    public final void prepare() {
        wash();
        cook();
        serve();
    }

    protected abstract void wash();
    protected abstract void cook();
    protected abstract void serve();
}

class Pizza extends Food {
    protected void wash() { System.out.println("Washing vegetables for pizza"); }
    protected void cook() { System.out.println("Baking pizza in oven"); }
    protected void serve() { System.out.println("Serving pizza slices"); }
}

class Soup extends Food {
    protected void wash() { System.out.println("Washing ingredients for soup"); }
    protected void cook() { System.out.println("Boiling soup"); }
    protected void serve() { System.out.println("Pouring soup into bowls"); }
}

class FoodTest {
    public static void main(String[] args) {
        Food[] meals = { new Pizza(), new Soup() };
        for (Food x : meals) {
            x.prepare();
            System.out.println("----");
        }
    }
}
