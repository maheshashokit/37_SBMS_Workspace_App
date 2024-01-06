package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Shopping {
	
	@Autowired
	@Qualifier("payment1")
	private Payment payment;
	
	public Shopping() {
		System.out.println("Shopping Class Default Constructor....");
	}
	
	//business method
	public String doShopping(String paymentType,double amount) {
		return payment.doPayment(paymentType, amount);
	}
	
	@Override
	public String toString() {
		return "Shopping=["+payment.getClass().getName()+"]";
	}
}