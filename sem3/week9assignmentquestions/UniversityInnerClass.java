
// Topic 5: Member and Static Inner Classes
// File: UniversityInnerClass.java

class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    class Department {
        private String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDepartmentInfo() {
            System.out.println("University: " + name + ", Department: " + deptName);
        }
    }

    static class ExamCell {
        static void conductExam() {
            System.out.println("Exams are being conducted!");
        }
    }
}

public class UniversityInnerClass {
    public static void main(String[] args) {
        University u = new University("Tech University");
        University.Department dept = u.new Department("Computer Science");
        dept.showDepartmentInfo();

        University.ExamCell.conductExam();
    }
}
