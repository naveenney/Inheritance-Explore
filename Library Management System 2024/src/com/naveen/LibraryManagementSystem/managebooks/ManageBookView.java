package com.naveen.LibraryManagementSystem.managebooks;

import java.util.Scanner;

public class ManageBookView {
	
	private ManageBookModel manageBookModel;
	
	public ManageBookView()
	{
		manageBookModel=new ManageBookModel(this);
		
	}

	
	public void addBooks()
	{
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("\nenter the bookName:");
	    String bookName=sc.next();
	    
	    System.out.print("\nenter the BookID:");
	    int id=sc.nextInt();
	    
	    System.out.print("\nenter the Book author:");
	    String author=sc.next();
	    
	    System.out.print("\nenter the publition year:");
	    int pubYear=sc.nextInt();
	    
	    System.out.print("\nenter the book Count:");
	    int count=sc.nextInt();
	    
	    manageBookModel.setBookDetails(bookName, id, author, pubYear ,count);
	    
	}

	

}
