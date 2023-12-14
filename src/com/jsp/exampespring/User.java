package com.jsp.exampespring;

public class User {
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	public int getUserId() {
		return userId;
		
	}
	
	public void setterEmail(String userEmail) {
		this.userEmail=userEmail;
		
	}
	public String getuserPassword() {
		return userPassword;
	}
	public void setUserPassword(String setPassword) {
		this.userPassword=userPassword;
	}

}
