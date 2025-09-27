import java.util.Date;

public class LearningPlatform {
    public static void main(String[] args) {
        Course[] courses = new Course[] {
            new VideoCourse("Java Basics", "A. Instructor", "2025-09-01", 75, 1800),
            new InteractiveCourse("Web Dev", "B. Teacher", "2025-08-20", 85, 3),
            new ReadingCourse("History", "C. Author", "2025-07-10", 120, 40),
            new CertificationCourse("AWS Cert", "D. Mentor", "2025-06-05", 2, true)
        };
        for (Course c : courses) {
            c.displayInfo();
            c.displayProgress();
            System.out.println();
        }
    }
}

class Course {
    String title, instructor, enrollDate;
    Course(String t, String i, String e) { title=t; instructor=i; enrollDate=e; }
    void displayInfo() {
        System.out.println("Course: " + title + " | Instructor: " + instructor + " | Enrolled: " + enrollDate);
    }
    void displayProgress() { System.out.println("Generic progress."); }
}

class VideoCourse extends Course {
    int percentComplete;
    int watchTimeSeconds;
    VideoCourse(String t,String i,String e,int p,int w){ super(t,i,e); percentComplete=p; watchTimeSeconds=w;}
    @Override
    void displayProgress(){
        System.out.println("Video Progress: " + percentComplete + "% | Watch time: " + watchTimeSeconds + "s");
    }
}

class InteractiveCourse extends Course {
    int quizScore;
    int projectsCompleted;
    InteractiveCourse(String t,String i,String e,int q,int p){ super(t,i,e); quizScore=q; projectsCompleted=p;}
    @Override
    void displayProgress(){
        System.out.println("Interactive Progress: Quiz score " + quizScore + "% | Projects: " + projectsCompleted);
    }
}

class ReadingCourse extends Course {
    int pagesRead;
    int notesPercent;
    ReadingCourse(String t,String i,String e,int p,int n){ super(t,i,e); pagesRead=p; notesPercent=n;}
    @Override
    void displayProgress(){
        System.out.println("Reading Progress: Pages read " + pagesRead + " | Notes: " + notesPercent + "%");
    }
}

class CertificationCourse extends Course {
    int examAttempts;
    boolean certified;
    CertificationCourse(String t,String i,String e,int a,boolean c){ super(t,i,e); examAttempts=a; certified=c;}
    @Override
    void displayProgress(){
        System.out.println("Certification Progress: Attempts " + examAttempts + " | Certified: " + certified);
    }
}