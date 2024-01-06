package com.ashokit.beans;

public class Test {
	
	private String username;
	private String password;
	
	
	public Test(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return String.format("Test Bean with Username is %s and Password is %s", username,password);
	}
	
	

}
