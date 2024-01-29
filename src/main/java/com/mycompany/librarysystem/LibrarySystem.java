package com.mycompany.librarysystem;

import java.util.InputMismatchException;
import java.util.Scanner;

//Christopher Angelo Lim - INF226
// Main class for library system interaction
public class LibrarySystem {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        do {
            try {
                System.out.println("Library System Menu:");
                System.out.println("ENTER 1 to VIEW CATALOG");
                System.out.println("ENTER 2 to ADD A BOOK TO CATALOG");
                System.out.println("ENTER 3 to BORROW A BOOK");
                System.out.println("ENTER 4 to RETURN A BOOK");
                System.out.println("ENTER 5 to VIEW BORROWED BOOKS");
                System.out.println("ENTER 6 to EXIT");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        library.displayBookCatalog();
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("\nADD A BOOK TO CATALOG");
                        System.out.print("Enter book title: ");
                        String newTitle = scanner.nextLine();

                        System.out.print("Enter book author: ");
                        String newAuthor = scanner.nextLine();

                        library.addBookToCatalog(newTitle, newAuthor);
                        break;

                    case 3:
                        System.out.println("\nBORROW A BOOK");
                        System.out.print("Enter book title: ");
                        String bookTitle = scanner.nextLine();

                        System.out.print("Enter book author: ");
                        String bookAuthor = scanner.nextLine();

                        library.borrowBook(bookTitle, bookAuthor);
                        break;

                    case 4:
                        library.returnBook();
                        break;

                    case 5:
                        library.displayBorrowedBooks();
                        break;

                    case 6:
                        System.out.println("\nEXITING PROGRAM...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("\nINVALID CHOICE. PLEASE TRY AGAIN\n");
                        break;
                } 
            }
            catch (InputMismatchException e) {
                System.out.println("\nInput Mismatch: PLEASE ENTER A VALID CHOICE. EXITING PROGRAM");
                return;
            }
        } while (true);
    }
}
