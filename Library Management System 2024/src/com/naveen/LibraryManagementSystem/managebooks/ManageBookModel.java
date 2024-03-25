package com.naveen.LibraryManagementSystem.managebooks;

import java.util.*;

import com.naveen.LibraryManagementSystem.datalayer.DataLayer;
import com.naveen.LibraryManagementSystem.model.Book;

public class ManageBookModel {
	
	private ManageBookView manageBookView;
	
	ArrayList <Book> bookList=new ArrayList<>();
	
	Book book;
	
	ManageBookModel(ManageBookView manageBookView)
	{
		this.manageBookView=manageBookView;
		bookList=new ArrayList<>();
		book=new Book();
	}

	
	public void setBookDetails(String bookName,int id,String bookAuthor,int pubYear,int count)
	{
		book.setBookName(bookName);
		book.setBookId(id);
		book.setBookAuthor(bookAuthor);
		book.setPublitionYear(pubYear);
		book.setAvailableCount(count);
	    DataLayer.getInstance().insertBook(book);
	}
}	


