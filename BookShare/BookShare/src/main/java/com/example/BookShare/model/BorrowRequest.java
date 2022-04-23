package com.bookshare.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class BorrowRequest {
	@Id
	private int borrowRequestId;
	private int bookId;
	private int ownerId;
	private int borrowerId;
	private int duration;
	private DateTimeFormat requestTime;
	private DateTimeFormat borrowTime;
	private String status;
	
	public int getBorrowRequestId() {
		return borrowRequestId;
	}
	public void setBorrowRequestId(int borrowRequestId) {
		this.borrowRequestId = borrowRequestId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public DateTimeFormat getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(DateTimeFormat requestTime) {
		this.requestTime = requestTime;
	}
	public DateTimeFormat getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(DateTimeFormat borrowTime) {
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
