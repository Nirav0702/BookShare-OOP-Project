package com.example.BookShare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Request 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RequestId;
	private int bookId;
	private String ownerName;
	private String borrowerName;
	private int duration;
	private String requestTime;
	private String borrowTime;
	private String status;
	
	public int getRequestId() {
		return RequestId;
	}
	public void setRequestId(int RequestId) {
		this.RequestId = RequestId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public String getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
//	public void approveRequest() {
//		return;
//	}
//	
//	public void declineRequest() {
//		return;
//	}
//	
//	public void cancelRequest() {
//		return;
//	}
//	
//	public void completeRequest() {
//		return;
//	}
}
