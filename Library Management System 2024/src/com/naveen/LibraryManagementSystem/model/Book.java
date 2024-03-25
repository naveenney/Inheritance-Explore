package com.naveen.LibraryManagementSystem.model;

public class Book {
	
	int bookId;
	
	String bookName;

	String bookAuthor;

	int publitionYear;

	int availableCount;

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookId(int id) {
		bookId = id;
	}

	public void setBookAuthor(String author) {
		bookAuthor = author;
	}

	public void setPublitionYear(int pubYear) {
		this.publitionYear = pubYear;
	}

	public void setAvailableCount(int count) {
		availableCount = count;
	}

	public String getBookName() {
		return bookName;
	}

	public int getId() {
		return bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public int getPublitionYear() {
		return publitionYear;
	}

	public int getBookCount() {
		return availableCount;
	}

}