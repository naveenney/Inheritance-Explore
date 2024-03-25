package com.naveen.LibraryManagementSystem.librarysetup;

import java.util.Scanner;

import com.naveen.LibraryManagementSystem.adminlogin.AdminLogInView;
import com.naveen.LibraryManagementSystem.managebooks.ManageBookView;
import com.naveen.LibraryManagementSystem.user.UserView;

public class LibrarySetUpView {
	
	private LibrarySetUpModel librarySetUpModel;
	
	public LibrarySetUpView()
	{
		librarySetUpModel=new LibrarySetUpModel(this);
	}
	
	public void init()
	{
		librarySetUpModel.startSetUp();
		
		}
	
	
	
	public void librarySetUp()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nenter the LibraryName:");
		String libraryName=sc.next();
		
		System.out.print("\nenter the library phoneno:");
		String phoneNo=sc.next();
		
		System.out.print("\nenter the LibraryLocation:");
		String libraryLocation=sc.next();
		
		System.out.print("\nenter the mail id:");
		String libraryMailId=sc.next();
		
	    librarySetUpModel.setLibraryDetails(libraryName,phoneNo,libraryLocation, libraryMailId);
		librarySetUpModel.startSetUp();
	}	
		
	public void setUpCompleted()
	{
		Scanner sc=new Scanner(System.in);
		
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("Press 1 => addBooks"+"\n\n"+"Press 2 => removeBooks"+"\n\nPress 3 => showBooks"+"\n\nPress 4 => add new user"+"\n\nPress 5 => show USer Details"+"\n\nPress 6 => search Books"+"\n\n7Press 7 => change password"+"\n\nPress 8 => Log out");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				new ManageBookView().addBooks();;
				break;
			case 2:
				System.out.println("enter the BookId to remove:");
				int id=sc.nextInt();
			    librarySetUpModel.removeBook(id);
			    break;
			case 3:
                  librarySetUpModel.showBook();			
			      break;
			case 4:
				  new UserView().addNewUser();
				  new UserView().addCredentials();
				  break;
			case 5:
			      librarySetUpModel.showUserDetails();
				  break;
			case 6:	
				 System.out.println("enter the book name:");
				 String bookName=sc.next();
				 librarySetUpModel.searchBooks(bookName);
 				 break;
			case 7:
				System.out.println("enter the new PassWord:");
				String password=sc.next();
				librarySetUpModel.setPassWord(password);
	            break;
			case 8:
				
				 flag=false;
				 new AdminLogInView().init1();
					break;
	          
			}
		}
	}
	
	public void alertMse(String mse)
	{
		System.out.println("\n"+mse);
	}
}
