package com.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		
		/*System.out.println("Started ::: BeanFactory Container is Lazy");
		
		//creating the BeanFactory Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		//XmlBeanDefinitions
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("spring.xml");
		
		//Requesting the bean object
		Student student = factory.getBean(Student.class);
		System.out.println(student);
		
		System.out.println("Ended ::: BeanFactory Container is Lazy");*/
		
		//Creating the ApplicationContext Container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Started ::::: ApplicationContext Container");
		
	    //Requesting the Spring beans from container
		Student st = context.getBean(Student.class);
		System.out.println(st.hashCode());
		Student st1 = context.getBean(Student.class);
		System.out.println(st1.hashCode());
		Student st2 = context.getBean(Student.class);
		System.out.println(st2.hashCode());
		
		Test test = context.getBean(Test.class);
		System.out.println("Test ::::" + test.hashCode());
		Test test1 = context.getBean(Test.class);
		System.out.println("Test ::::" + test1.hashCode());
		Test test2 = context.getBean(Test.class);
		System.out.println("Test ::::" + test2.hashCode());
		
		System.out.println("Ended   ::::: ApplicationContext Container");
		
	}
}