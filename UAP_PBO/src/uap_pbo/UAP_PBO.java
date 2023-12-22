/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uap_pbo;

import java.util.ArrayList;

/**
 *
 * @author aryad
 */

class Book{
    private String title, author;
    private int publicationYear;
    private boolean available;

    public Book(String title, String author, int publicationYear, boolean available) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
    }
    
    public Book(){
        
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public void displayInfo(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Publication Year: " + this.getPublicationYear());
        System.out.println("Available: " + this.isAvailable());
    }
}

class Library extends Book{
    protected ArrayList<Book> books = new ArrayList<>();
    
    public Library(){
        
    }
    
    public void addBook(Book book){
        this.books.add(book);
    }
    
    public void displayAvailableBooks(){
        System.out.println("Available Books in the Library:");
        for (Book i : this.books){
            if(i.isAvailable()){
                i.displayInfo();
                System.out.println();
            }
        }
    }    
    
}

class Member extends Library{
    private String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    
    public Member(String name){
        this.name = name;
    }
    public void borrowBook(Book book){
        if(book.isAvailable()){
            System.out.println(this.name + " has borrowed the book: " + book.getTitle());
            book.setAvailable(false);
            this.borrowedBooks.add(book);
            return;
        }
        
        System.out.println("Sorry, the book " + book.getTitle() + " is not available for borrowing.");
    }
    
    public void returnBook(Book book){
        if(this.borrowedBooks.contains(book)){
            System.out.println(this.name + " has returned the book: " + book.getTitle());
            book.setAvailable(true);
            this.borrowedBooks.remove(book);
            return;
        }
        
        System.out.println(this.name + " did not borrow the book: " + book.getTitle());
    }
    
    public void displayBorrowedBooks(){
        if(!this.borrowedBooks.isEmpty()){
            System.out.println(this.name + "'s Borrowed Books: ");
            for (Book i : this.borrowedBooks){
                i.displayInfo();
                System.out.println();
            }
            return;
        }
        
        System.out.println(this.name + " has not borrowed any books.");
    }
}
public class UAP_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Library library = new Library();
//        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true);
//        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, true);
//        Book book3 = new Book("1984", "George Orwell", 1949, false);
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        library.displayAvailableBooks();
//        Member member1 = new Member("Auvar Mahsa Fahlevi");
//        Library library = new Library();
//        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true);
//        library.addBook(book1);
//        member1.borrowBook(book1);
//        member1.displayBorrowedBooks();
//        member1.returnBook(book1);
//        member1.displayBorrowedBooks();
//        member1.returnBook(book2);
        Member member1 = new Member("Auvar Mahsa Fahlevi");
        Member member2 = new Member("Muhammad Fadhilah");
        Library library = new Library();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, true);
        Book book3 = new Book("1984", "George Orwell", 1949, true);
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member2.borrowBook(book2);
        member2.borrowBook(book3);
        library.displayAvailableBooks();
        member1.displayBorrowedBooks();
        member2.displayBorrowedBooks();
        member1.returnBook(book1);
        library.displayAvailableBooks();
    }
    
}
