package com.ashokit.beans;

public class Demo {
	
	//Defining the Field
	public String topicName;
	
	//Injecting the Value for above Field using DI
	//We are using constructor injection i.e..,constructor
	public Demo(String topicName) {
		this.topicName = topicName;
	}
	
	@Override
	public String toString() {
		return "Demo[topicName="+topicName+"]";
	}
}