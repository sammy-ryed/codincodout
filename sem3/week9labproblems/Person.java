class Address implements Cloneable {
    String city;
    String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return city + ", " + country;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy method
    protected Person deepClone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = new Address(address.city, address.country);
        return cloned;
    }

    public String toString() {
        return "Person[Name=" + name + ", Address=" + address + "]";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Delhi", "India");
        Person p1 = new Person("Sam", addr);

        // Shallow clone
        Person p2 = (Person) p1.clone();
        // Deep clone
        Person p3 = p1.deepClone();

        System.out.println("Original: " + p1);
        System.out.println("Shallow Clone: " + p2);
        System.out.println("Deep Clone: " + p3);

        // Modify address in original
        p1.address.city = "Mumbai";

        System.out.println("\nAfter modifying original's address:");
        System.out.println("Original: " + p1);
        System.out.println("Shallow Clone: " + p2);
        System.out.println("Deep Clone: " + p3);
    }
}
