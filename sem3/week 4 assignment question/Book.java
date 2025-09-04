public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    public Book() {
        this("", "", "", true);
    }

    public Book(String title, String author) {
        this(title, author, "", true);
    }

    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Dune", "Frank Herbert", "12345", true);
        b2.borrowBook();
        b3.borrowBook();
        b3.returnBook();
        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();
    }
}