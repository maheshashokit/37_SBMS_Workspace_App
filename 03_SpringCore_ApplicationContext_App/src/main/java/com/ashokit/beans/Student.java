package com.ashokit.beans;

public class Student {
	
	private String id;
	
	private String name;
	
	private String course;
	
	private String emailId;
	
	public Student() {
		System.out.println("Student Class Constructor");
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return String.format("Student Information [StudentId %s and StudentName %s and course %s and emailId %s", id,name,course,emailId);
	}

}
