package com.ashokit.beans;

public class Welcome {
	
	//Defining the Field
	public String message;

	//Injecting the Value for above Field using DI
    //We are using setter injection i.e..,setter method
	public void setMessage(String message) {
		this.message = message;
	}
	
	//Overriding toString() from object class
	@Override
	public String toString() {
		return "Welcome[message="+message+"]";
	}
}