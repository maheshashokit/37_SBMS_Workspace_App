package com.ashokit.beans;

public class UPIPayment implements Payment {

	@Override
	public String doPayment(String paymentSource, double amount) {
		return String.format("Payment Source %s and BillAmount is %s", paymentSource,amount);	
    }
}
