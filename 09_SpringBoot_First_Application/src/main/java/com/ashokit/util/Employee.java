package com.ashokit.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${empId}")
	private String employeeId;
	
	@Value("${empName}")
	private String employeeName;
	
	@Value("${empDesignation}")
	private String designation;
	
	@Value("${empSalary}")
	private double salary;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
}
