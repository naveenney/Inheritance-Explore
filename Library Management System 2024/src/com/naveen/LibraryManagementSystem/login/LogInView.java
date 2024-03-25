package com.naveen.LibraryManagementSystem.login;
import java.util.*;

import com.naveen.LibraryManagementSystem.librarysetup.LibrarySetUpView;
public class LogInView {
	

	private LogInModel logInModel;

	public LogInView() {
		logInModel = new LogInModel(this);
	}

    public void initiate()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the UserName:");
		String userName=sc.next();
		
		System.out.print("\nenter the password:");
		String passWord=sc.next();
		
		
		logInModel.validateUser(userName,passWord);
		
	}
	
    public void onSuccess()
    {
        new LibrarySetUpView().init();
    }
    
	public void alertMse(String alertMse)
	{
		System.out.println("\n"+alertMse);
	}

}
