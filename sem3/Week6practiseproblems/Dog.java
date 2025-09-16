public class Dog extends Mammal {
    private String breed;
    private boolean isDomesticated;
    private int loyaltyLevel;
    private String favoriteActivity;

    public Dog() {
        super("Dog", "Domestic", 13, false, "Varies", 60);
        this.breed = "Mixed";
        this.isDomesticated = true;
        this.loyaltyLevel = 5;
        this.favoriteActivity = "Playing";
        System.out.println("Dog constructor: Creating basic dog");
    }

    public Dog(String species, String habitat, int lifespan, boolean isWildlife, String furColor, int gestationPeriod, String breed, boolean isDomesticated, int loyaltyLevel, String favoriteActivity) {
        super(species, habitat, lifespan, isWildlife, furColor, gestationPeriod);
        this.breed = breed;
        this.isDomesticated = isDomesticated;
        this.loyaltyLevel = loyaltyLevel;
        this.favoriteActivity = favoriteActivity;
        System.out.println("Dog constructor: Creating " + breed + " dog");
    }

    public Dog(Dog other) {
        this(other.species, other.habitat, other.lifespan, other.isWildlife, other.furColor, other.gestationPeriod, other.breed, other.isDomesticated, other.loyaltyLevel, other.favoriteActivity);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is wagging tail while eating");
    }

    @Override
    public void move() {
        System.out.println("Dog is running and playing");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping in doghouse");
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }

    public void showLoyalty() {
        System.out.println("Loyalty level: " + loyaltyLevel + "/10");
    }

    public void demonstrateInheritance() {
        eat();
        move();
        sleep();
        bark();
        nurse();
        regulateTemperature();
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.demonstrateInheritance();

        Dog dog2 = new Dog("Dog", "House", 12, false, "Brown", 63, "Labrador", true, 9, "Fetching");
        dog2.eat();
        dog2.fetch();
        dog2.showLoyalty();

        Dog dog3 = new Dog(dog2);
        System.out.println("Copy constructor dog created with breed: " + dog3.breed);
    }
}
