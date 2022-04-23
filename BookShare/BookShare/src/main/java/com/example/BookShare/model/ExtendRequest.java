package com.bookshare.app;

public class ExtendRequest extends BorrowRequest{
	private int extendRequestId;
	private int extensionTime;
	private String status;
	
	public int getExtendRequestId() {
		return extendRequestId;
	}
	public void setExtendRequestId(int extendRequestId) {
		this.extendRequestId = extendRequestId;
	}
	public int getExtensionTime() {
		return extensionTime;
	}
	public void setExtensionTime(int extensionTime) {
		this.extensionTime = extensionTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public void changeDuration() {
		return;
	}
	
}
