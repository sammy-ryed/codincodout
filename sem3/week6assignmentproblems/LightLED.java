
// 🧪 HW PROBLEM 1: Light and LED Multiple Constructors
class Light {
    private String type;
    private int brightness;

    public Light() {
        this("Generic", 50);
        System.out.println("Default Light constructor");
    }

    public Light(String type) {
        this(type, 75);
        System.out.println("Light constructor with type");
    }

    public Light(String type, int brightness) {
        this.type = type;
        this.brightness = brightness;
        System.out.println("Light constructor with type and brightness");
    }
}

class LED extends Light {
    private String color;

    public LED() {
        this("White");
        System.out.println("Default LED constructor");
    }

    public LED(String color) {
        super("LED", 90);
        this.color = color;
        System.out.println("LED constructor with color");
    }

    public LED(String color, int brightness) {
        super("LED", brightness);
        this.color = color;
        System.out.println("LED constructor with color and brightness");
    }
}

class LightTest {
    public static void main(String[] args) {
        new LED();
        new LED("Blue");
        new LED("Red", 100);
    }
}
