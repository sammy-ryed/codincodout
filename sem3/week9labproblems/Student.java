import java.util.*;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(101, "Alice")); // Duplicate based on ID

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
