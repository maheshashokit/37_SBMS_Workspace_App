package com.ashokit.util;

import java.util.Arrays;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.ashokit")
public class Customer {
	
	private String customerId;
	
	private String customerName;
	
	private double billAmount;
	
	private Address address;
	
	private String[] colors;
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setColors(String[] colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", billAmount=" + billAmount
				+ ", address=" + address + ", colors=" + Arrays.toString(colors) + "]";
	}	
}