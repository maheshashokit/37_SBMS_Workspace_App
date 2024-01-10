package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.utils.TestUtils;

@Service
public class LoginService {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private TestUtils testUtils;
	
	public LoginService() {
		System.out.println("LoginService :::: Constructor...");
	}
	
	public void displayData() {
		System.out.println("UserService :::::" + userService.hashCode());
		System.out.println("CustomerService :::::" + customerService.hashCode());
		System.out.println("TestUtils :::::" + testUtils.hashCode());
		
	}
}