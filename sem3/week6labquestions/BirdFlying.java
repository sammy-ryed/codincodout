
// 🧪 LAB PROBLEM 3: Bird Flying Behavior
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins can't really fly, they swim instead");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky");
    }
}

class BirdTest {
    public static void main(String[] args) {
        Bird[] birds = { new Penguin(), new Eagle() };
        for (Bird x : birds) {
            x.fly();
        }
    }
}
