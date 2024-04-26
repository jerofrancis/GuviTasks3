package com.demo.task3;

import java.util.Scanner;

public class Library {

	
	private Book[] books;
    private int numBooks;

    public Library(int size) {
        this.books = new Book[size];
        this.numBooks = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

	//methhod to remove book
	public void removeBook(int bookId) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookID() == bookId) {
                // Shift elements to fill the gap
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--;
                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

	// Method to search for a book by ID
	 public Book searchBook(int bookId) {
	        for (int i = 0; i < numBooks; i++) {
	            if (books[i].getBookID() == bookId) {
	                return books[i];
	            }
	        }
	        return null;
	    }
	
	 public void displayBooks() {
	        if (numBooks == 0) {
	            System.out.println("No books in the library.");
	        } else {
	            for (int i = 0; i < numBooks; i++) {
	                System.out.println(books[i]);
	                System.out.println("-----------------------");
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Create a library with a maximum capacity of 5 books
        Library library = new Library(5);

        // Menu
        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is the book available? (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();
                    Book newBook = new Book(bookId, title, author, isAvailable);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter book ID to remove: ");
                    int removeBookId = scanner.nextInt();
                    library.removeBook(removeBookId);
                    break;
                case 3:
                    System.out.print("Enter book ID to search: ");
                    int searchBookId = scanner.nextInt();
                    Book searchedBook = library.searchBook(searchBookId);
                    if (searchedBook != null) {
                        System.out.println("Searched Book:");
                        System.out.println(searchedBook);
                    } else {
                        System.out.println("Book with ID " + searchBookId + " not found.");
                    }
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

		
	}


