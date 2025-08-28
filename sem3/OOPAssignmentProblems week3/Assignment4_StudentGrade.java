class Student {
    static int totalStudents=0; String studentId,studentName,className; double gpa; double[] marks;
    public Student(String id,String name,String cls,double[] marks){
        this.studentId=id; this.studentName=name; this.className=cls; this.marks=marks; totalStudents++; calculateGPA();
    }
    public void calculateGPA(){ double sum=0; for(double m:marks) sum+=m; gpa=sum/marks.length/10; }
    public void generateReportCard(){ System.out.println(studentId+" "+studentName+" GPA:"+gpa); }
}

public class Assignment4_StudentGrade {
    public static void main(String[] args){
        double[] m1={90,80,85}; Student s1=new Student("S1","Alice","10A",m1); s1.generateReportCard();
        double[] m2={70,75,65}; Student s2=new Student("S2","Bob","10B",m2); s2.generateReportCard();
        System.out.println("Total Students:"+Student.totalStudents);
    }
}