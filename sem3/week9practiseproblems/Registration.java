
// File: Registration.java
class ContactInfo implements Cloneable {
    String email;
    String phone;

    ContactInfo(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    String id;
    String name;
    ContactInfo contact;

    Student(String id, String name, ContactInfo contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    protected Object cloneShallow() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object cloneDeep() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.contact = (ContactInfo) contact.clone();
        return cloned;
    }
}

public class Registration {
    public static void main(String[] args) throws CloneNotSupportedException {
        ContactInfo c1 = new ContactInfo("abc@mail.com", "9999999999");
        Student s1 = new Student("S01", "Riya", c1);

        Student shallow = (Student) s1.cloneShallow();
        Student deep = (Student) s1.cloneDeep();

        s1.contact.email = "changed@mail.com";

        System.out.println("Shallow copy email: " + shallow.contact.email);
        System.out.println("Deep copy email: " + deep.contact.email);
    }
}
