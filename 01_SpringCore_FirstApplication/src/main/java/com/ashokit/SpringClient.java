package com.ashokit;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.beans.Demo;
import com.ashokit.beans.Test;
import com.ashokit.beans.User;
import com.ashokit.beans.Welcome;

public class SpringClient {

	public static void main(String[] args) {
		
		//Creating the spring container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		//loading the spring configuration File
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(factory);
		xbdr.loadBeanDefinitions("spring.xml");
		
		//Requesting the Spring Beans from spring container by using id attribute
		Welcome wb = (Welcome)factory.getBean("wb");
		Demo db = (Demo)factory.getBean("db");
		
		//printing the spring beans
		System.out.println(wb);
		System.out.println(db);
		
		//Requesting the spring beans by using class name
		Test tb = factory.getBean(Test.class);
		//System.out.println(tb);
		tb.displayData();		
		
		//Requesting the User Spring bean by using class name
		User user = factory.getBean(User.class);
		System.out.println(user);
		user.getUserRole("AIT123");
		
	}
}