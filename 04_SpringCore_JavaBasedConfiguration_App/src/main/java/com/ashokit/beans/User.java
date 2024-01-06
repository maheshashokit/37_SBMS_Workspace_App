package com.ashokit.beans;

public class User {
	
	private String username;
	
	private String password;

	//setter injection
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("Username %s and password %s",username,password);
	}
}