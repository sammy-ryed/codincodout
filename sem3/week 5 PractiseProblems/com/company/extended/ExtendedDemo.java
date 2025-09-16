package com.company.extended;
import com.company.security.AccessModifierDemo;

public class ExtendedDemo extends AccessModifierDemo {
    public ExtendedDemo(int privateField, String defaultField, double protectedField, boolean publicField) {
        super(privateField, defaultField, protectedField, publicField);
    }

    public void testInheritedAccess() {
        // System.out.println(privateField); // ❌ Not inherited
        // System.out.println(defaultField); // ❌ Not accessible outside package
        System.out.println(protectedField); // ✅ Accessible in subclass
        System.out.println(publicField); // ✅ Accessible

        protectedMethod(); // ✅ Accessible in subclass
        publicMethod(); // ✅ Accessible
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Overridden protected method in ExtendedDemo");
    }

    public static void main(String[] args) {
        ExtendedDemo extended = new ExtendedDemo(40, "Extended", 12.56, false);
        extended.testInheritedAccess();

        AccessModifierDemo demo = new AccessModifierDemo(50, "Parent", 15.70, true);
        demo.publicMethod(); // ✅ Accessible
        // demo.protectedMethod(); // ❌ Not accessible outside package without subclass
    }
}
