public class Book {
String title;
String author;
double price;
Book() {
title = "Unknown";
author = "Unknown";
price = 0.0;
}
Book(String title, String author, double price) {
this.title = title;
this.author = author;
this.price = price;
}
void display() {
System.out.println(title + " by " + author + " - $" + price);
}
public static void main(String[] args) {
Book b1 = new Book();
Book b2 = new Book("Java Basics", "John Doe", 299.99);
b1.display();
b2.display();
}
}