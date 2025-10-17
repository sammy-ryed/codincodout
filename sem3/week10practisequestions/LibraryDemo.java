public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library("Central City");
        Book b1 = new Book("Java Basics", "James Gosling", "1111");
        Book b2 = new Book("Python Guide", "Guido van Rossum", "2222");
        Book b3 = new Book("C++ Mastery", "Bjarne Stroustrup", "3333");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.showBooks();

        Member m = new Member("Ravi");
        m.borrowBook(b1);
        m.borrowBook(b2);
        m.showBorrowedBooks();
    }
}
