package com.example.BookShare.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReturnRequest
{
	@Id
	private int RequestId;

	private int returnRequestId;
	private int penalty;
	private String status;
	
	public int getReturnRequestId() {
		return returnRequestId;
	}
	public void setReturnRequestId(int returnRequestId) {
		this.returnRequestId = returnRequestId;
	}
	public int getPenalty() {
	return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public String getStatus() {
		return status;
}
	public void setStatus(String status) {
	this.status = status;
	}

	public void calculatePenalty() {
		return;
	}
	
	public void imposePenalty() {
		return;
	}
}