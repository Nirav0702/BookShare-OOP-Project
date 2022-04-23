package com.example.BookShare.model;
import org.springframework.web.servlet.ModelAndView;

public class Wallet {
	
	
	private int userId;	
	private int balance;
	private int totalDues;
	private int bookId;
	private int moneyOwed;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTotalDues() {
		return totalDues;
	}
	public void setTotalDues(int totalDues) {
		this.totalDues = totalDues;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getMoneyOwed() {
		return moneyOwed;
	}
	public void setMoneyOwed(int moneyOwed) {
		this.moneyOwed = moneyOwed;
	}	
	public void addMoney() {
	}
	public void withdrawMoney() {	
	}
	//public ModelandView displayWallet() {	
	//}
}