package com.mycompany.librarysystem;

//Christopher Angelo Lim - INF226
//Represents a book with title and author
public class Book {
    
    private String bookTitle;
    private String bookAuthor;
    
    Book next;
    
    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.next = null;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    @Override
    public String toString() {
        return this.bookTitle + " by " + this.bookAuthor;
    }
}
