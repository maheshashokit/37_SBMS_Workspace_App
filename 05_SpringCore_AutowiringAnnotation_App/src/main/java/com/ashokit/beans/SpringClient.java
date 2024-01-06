package com.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shopping sb = context.getBean(Shopping.class);
		
		String shoppingInfo = sb.doShopping("Online Payment", 25000);
		System.out.println(shoppingInfo);
		
		System.out.println("Shopping Object:::"+ sb);
	}
}
