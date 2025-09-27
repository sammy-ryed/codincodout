public class LibrarySystem {
    public static void main(String[] args) {
        LibraryUser[] users = new LibraryUser[] {
            new Student("Alice"),
            new Faculty("Bob"),
            new Guest("Charlie")
        };
        for (LibraryUser u : users) {
            u.entryLog();
            u.basicInfo();
            if (u instanceof Student) ((Student)u).borrowBook();
            if (u instanceof Faculty) ((Faculty)u).reserveBook();
            System.out.println();
        }
    }
}

class LibraryUser {
    String name;
    LibraryUser(String n){ name=n; }
    void entryLog(){ System.out.println(name + " entered library."); }
    void basicInfo(){ System.out.println("User: " + name); }
}

class Student extends LibraryUser {
    Student(String n){ super(n); }
    void borrowBook(){ System.out.println(name + " borrowed a book."); }
    void useComputer(){ System.out.println(name + " used a computer."); }
}

class Faculty extends LibraryUser {
    Faculty(String n){ super(n); }
    void reserveBook(){ System.out.println(name + " reserved a book."); }
    void accessResearch(){ System.out.println(name + " accessed research database."); }
}

class Guest extends LibraryUser {
    Guest(String n){ super(n); }
    void browse(){ System.out.println(name + " browsed books."); }
}