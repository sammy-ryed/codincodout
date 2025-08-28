class Book {
    private static int counter=0;
    private String bookId, title, author;
    private boolean isAvailable=true;
    public Book(String title,String author){
        this.title=title; this.author=author;
        this.bookId="B"+(++counter);
    }
    public void issueBook(){ if(isAvailable) isAvailable=false; }
    public void returnBook(){ isAvailable=true; }
    public void displayBookInfo(){ System.out.println(bookId+" "+title+" "+author+" Available:"+isAvailable); }
    public boolean getAvailability(){ return isAvailable; }
    public String getBookId(){ return bookId; }
}

class Member {
    private static int counter=0;
    private String memberId, memberName;
    public Member(String name){ this.memberName=name; this.memberId="M"+(++counter); }
    public void borrowBook(Book book){ if(book.getAvailability()) book.issueBook(); }
    public void returnBook(Book book){ book.returnBook(); }
    public void displayMember(){ System.out.println(memberId+" "+memberName); }
}

public class LibrarySystem {
    public static void main(String[] args){
        Book b1=new Book("Java","James");
        Book b2=new Book("C++","Bjarne");
        Member m1=new Member("Alice");
        m1.borrowBook(b1);
        b1.displayBookInfo();
        m1.returnBook(b1);
        b1.displayBookInfo();
    }
}