package com.naveen.LibraryManagementSystem.model;

import java.util.Date;


public class AssignBooks {

    User user;
	
	Date date;
	
	public AssignBooks(User user,Date date)
	{
		this.user=user;
        this.date=date;
	}
	
	public String getUserName()
	{
		return user.getName();
	}
	
	public Date getDate()
	{
	   return date;	
	}
}
