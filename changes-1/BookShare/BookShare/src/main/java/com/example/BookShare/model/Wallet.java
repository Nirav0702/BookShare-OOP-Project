package com.example.BookShare.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.servlet.ModelAndView;

@Entity
public class Wallet
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
	private String userName;
	private int balance;
	private int totalDues;
	private int bookId;
	private int moneyOwed;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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