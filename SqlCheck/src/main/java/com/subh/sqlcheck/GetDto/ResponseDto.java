package com.subh.sqlcheck.GetDto;

public class ResponseDto {
	private int userId;
	private String EmailId;
	private boolean isEnable;
	private String Password;
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public boolean isEnable() {
		return isEnable;
	}
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ResponseDto(int userId, String emailId, boolean isEnable, String password, String userName) {
		super();
		this.userId = userId;
		EmailId = emailId;
		this.isEnable = isEnable;
		Password = password;
		this.userName = userName;
	}
	
	
	
}
