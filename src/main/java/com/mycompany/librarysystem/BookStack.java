package com.mycompany.librarysystem;

//Christopher Angelo Lim - INF226
//Stack Data Structure for managing books
public class BookStack {
    
    Book top;
    
    private int size;
    
    public BookStack() {
        this.top = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(String title, String author) {
        Book newBook = new Book(title, author);
        
        newBook.next = top;
        top = newBook;
        
        size++;
    }
    
    public Book pop() {
        if (isEmpty()) {
            System.out.println("Book Stack is EMPTY");
            return null;
        }
        
        Book temp = top;
        top = top.next;
        temp.next = null;
        
        size--;
        return temp;
    }
    
    public Book peek() {
        return top;
    }
    
    public int size() {
        return size;
    }
}
