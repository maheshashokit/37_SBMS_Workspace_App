package com.ashokit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Test {
	
	//Simple Properties
	public String[] courses;
	public List<String> names;
	public Map<String,String> faculties;
	public Properties props;
	
	//setter method to inject the values
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public void setFaculties(Map<String, String> faculties) {
		this.faculties = faculties;
	}	
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(courses);
	}
	
	//business method to display the data
	public void displayData() {
		System.out.println("Courses    ::::" + Arrays.toString(courses));
		System.out.println("Names      ::::" + names);
		System.out.println("Faculties  ::::" + faculties);
		System.out.println("Properties ::::" + props);
	}

}
