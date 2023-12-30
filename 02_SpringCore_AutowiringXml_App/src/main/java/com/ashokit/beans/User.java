package com.ashokit.beans;

public class User {
	
	private String username;
	private String password;
	private Address address;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(Address address) {
		System.out.println("Inside the Setter Method......");
		this.address = address;
	}
	
	public User(Address address) {
		System.out.println("Inside the Constructor.......");
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", address=" + address + "]";
	}
}
