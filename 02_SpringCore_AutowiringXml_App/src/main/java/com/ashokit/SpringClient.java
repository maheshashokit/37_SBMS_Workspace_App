package com.ashokit;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.beans.Login;
import com.ashokit.beans.Test;
import com.ashokit.beans.User;

public class SpringClient {

	public static void main(String[] args) {

		//Creating the spring container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		//loading the bean configuration
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("spring.xml");
		
		//Requesting the spring bean from Spring container
		User user = factory.getBean(User.class);
		System.out.println(user);
		
		//Requesting the spring bean from spring container
		Login login = factory.getBean(Login.class);
		System.out.println(login);
		
		//Requesting the spring bean from spring container
		Test test = factory.getBean(Test.class);
		System.out.println(test);
	}

}
