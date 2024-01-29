package com.mycompany.librarysystem;

import java.util.ArrayList;

//Christopher Angelo Lim - INF226
//Represents the library and its operations
public class Library {
    
    private BookStack bookStack;
    private ArrayList<Book> catalog;
    
    public Library() {
        bookStack = new BookStack();
        catalog = new ArrayList<>();
    }
    
    public void addBookToCatalog(String title, String author) {
        Book newBook = new Book(title, author);
        
        catalog.add(newBook);
        System.out.println("\nBOOK ADDED TO CATALOG: " + newBook.toString() + "\n");
    }
    
    public void displayBookCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("\nNO AVAILABLE BOOKS TO BORROW");
        }
        else {
            System.out.println("\n======== CATALOG OF AVAILABLE BOOKS ========");
        
            for (Book books : catalog) {
                System.out.println(books.toString());
                System.out.println("============================================");
            }
        }
    }
    
    public void borrowBook(String title, String author) {
       Book bookToBorrow = null;
       
       for (Book book : catalog) {
           if (book.getBookTitle().equals(title) && book.getBookAuthor().equals(author)) {
               bookToBorrow = book;
               break;
           }
       }
       
       if (bookToBorrow != null) {
           bookStack.push(bookToBorrow.getBookTitle(), bookToBorrow.getBookAuthor());
           catalog.remove(bookToBorrow);
           
           System.out.println("\n" + title + " by " + author + " BORROWED SUCCESSFULLY.\n");
       }
       else {
           System.out.println("\n" + title + " by " + author + " IS NOT AVAILABLE IN THE CATALOG.\n");
       }
    }
    
    public void returnBook() {
        if (bookStack.isEmpty()) {
            System.out.println("\nNO BORROWED BOOKS. CANNOT RETURN\n");
        }
        else {
            Book bookToReturn = bookStack.pop();
            
            System.out.println("\nRETURNED BOOK: " + bookToReturn.toString() + "\n");
            
            catalog.add(bookToReturn);
        }
    }
    
    public void displayBorrowedBooks() {
        if (bookStack.top == null) {
            System.out.println("\nNO BORROWED BOOKS");
        }
        else {
            Book temp = bookStack.top;
            
            System.out.println("\n============== BORROWED BOOKS ==============");
            
            while(temp != null) {
                System.out.println(temp.toString());
                System.out.println("============================================");
                
                temp = temp.next;
            }
        }
        
        System.out.println("");
    }
}
