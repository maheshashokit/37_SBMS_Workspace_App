package com.ashokit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.ashokit.beans.Course;
import com.ashokit.beans.Student;
import com.ashokit.beans.User;

//This will acts as Spring Configuration File as well as Spring bean
@Configuration

//Inheriting the configuration from DatabaseConfig class
@Import(value = {DatabaseConfig.class,EmailConfig.class})

//Inheriting the bean definitions from spring configuration file
@ImportResource(value = "spring.xml")

//locate the properties file in Spring Application
@PropertySource(value = "database.properties")
public class SpringConfig {
	
	//Reading the values from properties file using property key
	@Value("${dbUserName}")
	private String databaseUserName;
	
	@Value("${dbPassword}")
	private String databasePassword;	
	
	//creating the Java method to represent as Spring bean i.e.,User
	@Bean
	public User getUserObject() {
		
		//return new User();
		User user = new User();
		user.setUsername(databaseUserName);
		user.setPassword(databasePassword);
		return user;
	}
	
	//creating the Java method to represent as Spring bean i.e.,Address
	@Bean
	public Student getStudentObject() {
		Student st = new Student();
		st.setId("AIT123");
		st.setName("Mahesh");
		st.setEmailId("mahesh.ashokit@gmail.com");
		//Injecting the courseBean into student Bean
		st.setCourse(getCourseBean());
		return st;
	}
	
	@Bean
	public Course getCourseBean() {
		Course course = new Course();
		course.setCourseName("SpringBootMicroservices");
		course.setCourseFee(8000);
		return course;
	}
}
