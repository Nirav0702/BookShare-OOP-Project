package com.example.BookShare.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.ModelAndView;

@Entity
public class Book {
	
	@Id
	private int bookId;
	private int borrowerId;
	private int ownerId;
	private String bookAuthor;
	private String bookPublisher;
	private String bookEdition;
	private String bookYear;
	private String bookTitle;
	private boolean availability;
	//private DateTimeFormat timeBorrowed;
	//private DateTimeFormat timereturned;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookEdition() {
		return bookEdition;
	}
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}
	public String getBookYear() {
		return bookYear;
	}
	public void setBookYear(String bookYear) {
		this.bookYear = bookYear;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	/*
	public DateTimeFormat getTimeBorrowed() {
		return timeBorrowed;
	}
	public void setTimeBorrowed(DateTimeFormat timeBorrowed) {
		this.timeBorrowed = timeBorrowed;
	}
	public DateTimeFormat getTimereturned() {
		return timereturned;
	}
	public void setTimereturned(DateTimeFormat timereturned) {
		this.timereturned = timereturned;
	}
	*/
	
	/*
	public ModelAndView viewBookStatus() {
		
	}
	public ModelAndView borrowBook() {
		
	}
	
	public ModelAndView returnBook() {
		
	}
	*/

}