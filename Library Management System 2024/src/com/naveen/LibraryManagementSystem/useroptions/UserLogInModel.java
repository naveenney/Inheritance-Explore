package com.naveen.LibraryManagementSystem.useroptions;

import com.naveen.LibraryManagementSystem.datalayer.DataLayer;

public class UserLogInModel {
	
	private UserLoginView userLogInView;

	
	UserLogInModel(UserLoginView userLogInView)
	{
		this.userLogInView=userLogInView;
	}
	
	public void bookRequest(int id,String name,String author)
	{
       if(DataLayer.getInstance().reqBook(id,name,author))
    	   userLogInView.alertMse("your Request Is accepted..");
           
       else
    	   userLogInView.alertMse("Sorry You Are Already Reached your BookLimit!!");
           userLogInView.init();
	}
	
	public void showAssignedBooks()
	{
		DataLayer.getInstance().showAssignedBooks();
	}
	public void showBooks()
	{
		DataLayer.getInstance().showBooks();
	}
	
	public void searchBooks(String bookName)
	{
		DataLayer.getInstance().searchBooks(bookName);
	}
	
	public void setPassWord(String password)
	{
		DataLayer.getInstance().setUserPassword(password);
	}
	
	

}
