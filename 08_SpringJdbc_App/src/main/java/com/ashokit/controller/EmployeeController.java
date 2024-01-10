package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.dtos.EmployeeDetails;
import com.ashokit.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public void addingNewEmployee(EmployeeDetails empDetails) {
		boolean empCreatedStatus = employeeService.createBrandNewEmployee(empDetails);
		if(empCreatedStatus) {
			System.out.println("Employee Record got Created.....");
		}else {
			System.out.println("There is Problem while creating record.....");
		}
	}
	
	public void displayAllEmployees() {
		 employeeService.fetchAllEmployees();
	}

}
