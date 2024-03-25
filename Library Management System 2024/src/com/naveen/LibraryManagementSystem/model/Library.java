package com.naveen.LibraryManagementSystem.model;

public class Library {
      
	int id;
	
	String libraryName;
	
	String phoneNo;
	
	String location;
	
	String mailId;
	
	public void setName(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		libraryName=name;
	}
	
	public void setPhoneNo(String phoneno)
	{
		phoneNo=phoneno;
	}
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	
	public void setMailId(String mailId)
	{
		this.mailId=mailId;
	}
	
	
}
