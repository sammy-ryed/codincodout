
// Topic 4: Deep vs Shallow Cloning of Objects
// File: LibraryClone.java

import java.util.*;

class Book implements Cloneable {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Library implements Cloneable {
    List<Book> books = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    protected Library deepClone() throws CloneNotSupportedException {
        Library cloned = new Library();
        for (Book b : books) {
            cloned.books.add((Book) b.clone());
        }
        return cloned;
    }
}

public class LibraryClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library lib1 = new Library();
        lib1.books.add(new Book("Java", "James Gosling"));
        lib1.books.add(new Book("Python", "Guido van Rossum"));

        Library shallow = (Library) lib1.clone();
        Library deep = lib1.deepClone();

        lib1.books.get(0).title = "Java Updated";

        System.out.println("Shallow clone first book title: " + shallow.books.get(0).title);
        System.out.println("Deep clone first book title: " + deep.books.get(0).title);
    }
}
