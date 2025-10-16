
// Topic 3: hashCode() and equals() Contract
// File: StudentHashSet.java

import java.util.*;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student s = (Student) obj;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name;
    }
}

public class StudentHashSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "Asha"));
        set.add(new Student(2, "Rahul"));
        set.add(new Student(1, "Asha Duplicate"));

        System.out.println("HashSet contents:");
        for (Student s : set)
            System.out.println(s);
    }
}
