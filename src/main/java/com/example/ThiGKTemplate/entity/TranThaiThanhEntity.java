package com.example.ThiGKTemplate.entity;

public class TranThaiThanhEntity {
	private String UserId;
	private String Username;
	private String Password;
	private String Email;
	
	
	public TranThaiThanhEntity(String userId, String username, String password, String email) {
		super();
		UserId = userId;
		Username = username;
		Password = password;
		Email = email;
	}
	public TranThaiThanhEntity() {
		super();
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "TranThaiThanhEntity [UserId=" + UserId + ", Username=" + Username + ", Password=" + Password
				+ ", Email=" + Email + "]";
	}

	
}
