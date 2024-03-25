package com.naveen.LibraryManagementSystem.datalayer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.naveen.LibraryManagementSystem.model.AdminCredentials;
import com.naveen.LibraryManagementSystem.model.AssignBooks;
import com.naveen.LibraryManagementSystem.model.Book;
import com.naveen.LibraryManagementSystem.model.Library;
import com.naveen.LibraryManagementSystem.model.User;
import com.naveen.LibraryManagementSystem.model.UserCredentials;
import com.naveen.LibraryManagementSystem.useroptions.UserLogInModel;

public class DataLayer {

	private static DataLayer libraryDataLayer;
	private Library library;
	private ArrayList<Book> bookList;
	private ArrayList<User> userList;
	private AdminCredentials adc;
	private UserCredentials cre;
	private ArrayList<UserCredentials> userCredentialsList;
	private ArrayList<AssignBooks> assignedBooksToUserList;
	private Date date;
	private AssignBooks assignBooks;

	private DataLayer() {
		bookList = new ArrayList<>();
		userList = new ArrayList<>();
		adc = new AdminCredentials();
		cre = new UserCredentials();
		userCredentialsList = new ArrayList<>();
		assignedBooksToUserList = new ArrayList<>();
	}

	public static DataLayer getInstance() {
		if (libraryDataLayer == null)

			libraryDataLayer = new DataLayer();

		return libraryDataLayer;
	}

	public boolean validateAdminUserName(String username) {
		return username.equals(adc.getAdminUserName());
	}

	public boolean validateAdminPassWord(String password) {
		return password.equals(adc.getAdminPassWord());
	}

	public void insertLibrary(Library library) {
		this.library = library;
	}

	public Library getLibrary() {
		return library;
	}

	public void insertBook(Book book) {
		bookList.add(book);
	}

	public void showBooks() {
	
	    System.out.println("\n");
		System.out.printf("%5s %15s %20s %25s %30s\n\n","ID","BOOK NAME","BOOK AUTHOR","PUBLITION YEAR","AVAILABLE COUNT");
		
         for (Book book : bookList) {
			
			System.out.printf("%3d %13s %18s %23d %28d\n\n",book.getId(),book.getBookName(),book.getBookAuthor(),book.getPublitionYear(),book.getBookCount());
         }
		System.out.println("\n");

	}

	public void removeBook(int id) {
		for (Book book : bookList) {
			if (book.getId() == id) {
				bookList.remove(book);
			}
		}
	}

	public void searchBooks(String bookName) {
		
		System.out.printf("%5s %15s %20s %25s %30s\n","BOOK ID","BOOK NAME","BOOK AUTHOR","PUBLITION YEAR","AVAILABLE COUNT");
		
		for (Book book : bookList) {
			if (book.getBookName().contains(bookName)) {
				System.out.printf("%5d %13s %18s %23d %28d\n\n");
			}
		}
		System.out.println("");
	}

	public void addUserCredentials(UserCredentials cre) {
		userCredentialsList.add(cre);
	}

	public boolean userContains(String username, String passWord) {
		for (UserCredentials uc : userCredentialsList) {
			if (uc.userContains(username, passWord)) {
				return true;
			}
		}
		return false;
	}

	public boolean CheckUserId(int id) {
		for (User user : userList) {
			if (user.getId() == id) {
				return false;
			}
		}
		return true;
	}

	public void insertUserDetails(User user) {
		userList.add(user);
	}

	public void showUserDetails() {
		
		System.out.printf("%5s %10s %15s %15s %15s\n\n","ID","NAME","PHONENO","MAILID","ADDRESS");
	
		for(User user:userList)
		{
			System.out.printf("%3d %13s %13d %13s %13s\n\n",user.getId(),user.getName(),user.getphoneNo(),user.getMailId(),user.getAddress());
		}
		
		
			}

	public boolean reqBook(int id, String bookName, String bookAuthor) {
		for (User user : userList) {
			if (id == user.getId()) {
				for (Book b : bookList) {
					if (bookName.equals(b.getBookName()) && bookAuthor.equals(b.getBookAuthor()))
						if (user.getBookLimit() < 5) {
							user.increaseUserBookCount();
							int tem = b.getBookCount();
							b.setAvailableCount(tem - 1);
							SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyy");
							try {
								date = sim.parse("04/04/2024");
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							assignBooks = new AssignBooks(user, date);
							assignedBooksToUserList.add(assignBooks);
							return true;
						} else
							return false;
				}

			}
		}
		return false;

	}

	public void showAssignedBooks() {
		for (AssignBooks a : assignedBooksToUserList) {

			System.out.println(a.getUserName() + " " + date);
		}
	}

	public void setAdminUserName(String username) {
		adc.setAdminPassword(username);
	}

	public void setAdminPassWord(String password) {
		adc.setAdminPassword(password);
	}

	public String getAdminUserName() {
		return adc.getAdminUserName();
	}

	public String getAdminPassword() {
		return adc.getAdminPassWord();
	}

	public void setUserUserName(String username) {
		cre.setUserName(username);
	}

	public void setUserPassword(String password) {
		cre.setUserPassWord(password);
	}

	public String getUserUserName() {
		return cre.getUserName();
	}

	public String getUserPassWord() {
		return cre.getUserPassWord();
	}
}
