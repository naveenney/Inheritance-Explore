package com.naveen.LibraryManagementSystem.model;

public class User {
	
	
	int id;
    String name;
    String phoneNo;
	String mailId;
	String address;
	int bookLimit;

	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	
	public void setMailId(String mailId)
	{
		this.mailId=mailId;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getphoneNo()
	{
		return phoneNo;
	}
	
	public String getMailId()
	{
		return mailId;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getBookLimit()
	{
		return bookLimit;
	}
	
	public void increaseUserBookCount()
	{
		bookLimit++;
	}
   
	public void decreaseBookCount()
	{
		bookLimit--;
	}
	
	public void setUserBookCount(int count)
	{
		bookLimit=count;
	}
	
}
