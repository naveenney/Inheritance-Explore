package com.naveen.LibraryManagementSystem.user;
import java.util.*;
public class UserView {
	static int id;
	UserModel userModel;
	
	public UserView()
	{
		userModel=new UserModel(this);
	}
	
	public void addNewUser()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the user id");
		int id=sc.nextInt();
		
		System.out.print("enter the Name:");
		String name=sc.next();
		
		System.out.print("enter the User PhoneNo:");
		String phoneNo=sc.nextLong();
		
		System.out.print("enter the User mailId:");
		String mailId=sc.next();
		
		System.out.print("enter the User address:");
		String address=sc.next();
		
		userModel.setUserDetails(id, name, phoneNo, mailId, address);
	
	}
	
	public void addCredentials()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter the User Name:");
		String userName=scan.next();
		
		System.out.print("enter the User PassWord:");
		String password=scan.next();
		
		
		userModel.setCredentials(userName, password);
	}
	
	
	public void alertMse(String altmse)
	{
	   System.out.println(altmse);
	   
	}

}
