package com.company.security;

public class AccessModifierDemo {
    private int privateField;
    String defaultField;
    protected double protectedField;
    public boolean publicField;

    private void privateMethod() {
        System.out.println("Private method called");
    }

    void defaultMethod() {
        System.out.println("Default method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    public void publicMethod() {
        System.out.println("Public method called");
    }

    public AccessModifierDemo(int privateField, String defaultField, double protectedField, boolean publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.protectedField = protectedField;
        this.publicField = publicField;
    }

    public void testInternalAccess() {
        System.out.println("Private Field: " + privateField);
        System.out.println("Default Field: " + defaultField);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Public Field: " + publicField);

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(10, "Default", 3.14, true);
        // demo.privateField; // ❌ Not accessible outside class
        System.out.println(demo.defaultField); // ✅ Accessible within same package
        System.out.println(demo.protectedField); // ✅ Accessible within same package
        System.out.println(demo.publicField); // ✅ Accessible everywhere

        demo.testInternalAccess();
    }
}

class SamePackageTest {
    public static void testAccess() {
        AccessModifierDemo demo = new AccessModifierDemo(20, "Package", 6.28, false);
        // System.out.println(demo.privateField); // ❌ Not accessible
        System.out.println(demo.defaultField); // ✅ Accessible
        System.out.println(demo.protectedField); // ✅ Accessible
        System.out.println(demo.publicField); // ✅ Accessible

        // demo.privateMethod(); // ❌ Not accessible
        demo.defaultMethod(); // ✅ Accessible
        demo.protectedMethod(); // ✅ Accessible
        demo.publicMethod(); // ✅ Accessible
    }
}
