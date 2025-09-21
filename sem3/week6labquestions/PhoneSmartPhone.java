
// 🧪 LAB PROBLEM 2: Phone and SmartPhone Constructor Chaining
class Phone {
    protected String brand;
    protected String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Phone constructor called");
    }
}

class SmartPhone extends Phone {
    private String operatingSystem;

    public SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        System.out.println("SmartPhone constructor called");
    }
}

class PhoneTest {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Apple", "iPhone 15", "iOS");
    }
}
