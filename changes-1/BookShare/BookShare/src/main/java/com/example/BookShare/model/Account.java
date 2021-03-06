package com.example.BookShare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Account
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int userId;
	 private String userName;
	 private String password;
	 private String phoneNumber;
	 private String email;
	 private String address;
	 private String userType;
	 public Account(){}
	 public Account(int userId, String userName, String password, String phoneNumber, String email, String address,
				String userType) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.address = address;
			this.userType = userType;
		}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	 
	private void resetPassword() {
		//Reset Password Code here
	}
	
	private void loginUser() {
		//Login User
	}
	
	private void changeName() {
		//Change Name
	}
	@Override
	public String toString() {
		return "Account [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", address=" + address + ", userType=" + userType + "]";
	}
	
}
