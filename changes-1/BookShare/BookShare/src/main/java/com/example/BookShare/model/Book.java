package com.example.BookShare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.servlet.ModelAndView;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String borrowerName;
	private String ownerName;
	private String bookAuthor;
	private String bookPublisher;
	private String bookEdition;
	private String bookYear;
	private String bookTitle;
	private boolean availability;
	private String timeBorrowed;
	private String timereturned;
	private String boookIdCopy;
	public Book() {}
	
	
	
	public String getBoookIdCopy() {
		return boookIdCopy;
	}
	public void setBoookIdCopy(int id) {
		this.boookIdCopy = String.valueOf(id);
	}


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
	
	public String getTimeBorrowed() {
		return timeBorrowed;
	}
	public void setTimeBorrowed(String timeBorrowed) {
		this.timeBorrowed = timeBorrowed;
	}
	public String getTimereturned() {
		return timereturned;
	}
	public void setTimereturned(String timereturned) {
		this.timereturned = timereturned;
	}
	
	/*
	public ModelAndView viewBookStatus() {
		
	}
	public ModelAndView borrowBook() {
		
	}
	
	public ModelAndView returnBook() {
		
	}
	*/

}