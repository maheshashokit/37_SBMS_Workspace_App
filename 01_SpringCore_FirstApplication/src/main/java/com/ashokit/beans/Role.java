package com.ashokit.beans;

public class Role {
	
	//Defining the Constructor
	public Role() {
		System.out.println("Role Class ::: Constructor");
	}
	
	// Business method
	public String getRoleByUserId(String userId) {
		// We can write logic to get the Role of its user from DB.
		return "HRADMIN";
	}
}