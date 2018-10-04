package com.api.model;

public class JwtUser {
	
	private long id;
	private String userName;
	private String role;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

}
