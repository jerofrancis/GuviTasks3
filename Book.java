package com.demo.task3;

public class Book {

	// attributes
	int bookID;
	String title;
	String author;
	boolean isAvailable;

	// Constructor to initialize book attributes
	public Book(int bookID, String title, String author, boolean isAvailable) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
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

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable
				+ "]";
	}
	

}
