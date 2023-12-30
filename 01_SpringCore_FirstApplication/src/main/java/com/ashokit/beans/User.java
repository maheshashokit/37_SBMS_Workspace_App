package com.ashokit.beans;

public class User {
	
	//Defining the Constructor
	public User() {
		System.out.println("User Class :::: Constructor");
	}
	
	//Requires Role object
	public Role role;
	
	//Setter method to inject role object into user object
	public void setRole(Role role) {
		this.role = role;
	}
	
	//Defining the constructor
	public User(Role role) {
		this();
		this.role = role;
	}
	
	//business method
	public void getUserRole(String userId) {
		// calling the Business Method of Role Class...
		String roleName = role.getRoleByUserId(userId);
		System.out.println("Role Checking:::::" + "HRADMIN".equals(roleName));
	}

}
