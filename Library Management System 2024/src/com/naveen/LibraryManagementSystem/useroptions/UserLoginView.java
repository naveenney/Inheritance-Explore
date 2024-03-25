package com.naveen.LibraryManagementSystem.useroptions;
import java.util.Scanner;
public class UserLoginView {
 
	UserLogInModel userLogInModel;
	
	public UserLoginView()
	{
		userLogInModel=new UserLogInModel(this);
	}
	
	public void init()
	{
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Press 1 => show books"+"\nPress 2 => search books"+"\n Press 3 => Request Book"+"\nPress 4 => Show Assigned Books"+"\n Press 5 => 5Change Password"+"\nPress 6 => Log out");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
			   userLogInModel.showBooks();
			   break;
			case 2:
				System.out.println("enter the Book Name:");
				String bookName=scan.next();
				userLogInModel.searchBooks(bookName);
				break;
			case 3:
				System.out.print("Enter your user Id:");
				int id=scan.nextInt();
				System.out.print("Enter the bookName:");
				String bookname=scan.next();
				System.out.print("Enter the bookAuthor:");
				String author=scan.next();
				userLogInModel.bookRequest(id,bookname,author);
				break;
				
			case 4:
				userLogInModel.showAssignedBooks();
				break;
				
		   	case 5:
				System.out.println("enter the password:");
		        String password=scan.next();	
		        userLogInModel.setPassWord(password);
		        break;
		        
		   	case 6:
		   		flag=false;
		   		break;
		        
		}
		
		
	}
	
	}
	
	public void alertMse(String mse)
	{
		System.out.println(mse);
	}
}
