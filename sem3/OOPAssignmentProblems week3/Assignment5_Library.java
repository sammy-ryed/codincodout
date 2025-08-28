class Book {
    static int totalBooks=0; String bookId,title,author; boolean isIssued=false;
    public Book(String id,String title,String author){ this.bookId=id; this.title=title; this.author=author; totalBooks++; }
}

class Member {
    static int totalMembers=0; String memberId,memberName; public Member(String id,String name){ this.memberId=id; this.memberName=name; totalMembers++; }
}

public class Assignment5_Library {
    public static void main(String[] args){
        Book b1=new Book("B1","Java","James"); Member m1=new Member("M1","Alice");
        b1.isIssued=true; System.out.println(m1.memberName+" issued "+b1.title);
        System.out.println("Total Books:"+Book.totalBooks+" Members:"+Member.totalMembers);
    }
}