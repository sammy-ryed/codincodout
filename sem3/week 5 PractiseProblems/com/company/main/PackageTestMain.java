package com.company.main;
import com.company.security.AccessModifierDemo;

public class PackageTestMain {
    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(30, "Cross", 9.42, true);
        // System.out.println(demo.privateField); // ❌ Not accessible
        // System.out.println(demo.defaultField); // ❌ Not accessible outside package
        // System.out.println(demo.protectedField); // ❌ Not accessible without subclass
        System.out.println(demo.publicField); // ✅ Accessible everywhere

        demo.publicMethod(); // ✅ Accessible
    }
}
