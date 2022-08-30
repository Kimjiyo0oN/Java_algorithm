package edu.kh.opp.method.model.vo;

public class User {
	private String userId;
	private String userPW;
	private String userName;
	private int userAge;
	private char userGender;
	
	public User() {}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	public String getUserId() {
		return userId;
	}
	public String getUserPW() {
		return userPW;
	}
	public String getUserName() {
		return userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public char getUserGender() {
		return userGender;	
	}
}
