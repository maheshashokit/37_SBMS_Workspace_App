package com.ashokit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.EmployeeDao;
import com.ashokit.dtos.EmployeeDetails;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public boolean createBrandNewEmployee(EmployeeDetails empDetails) {
		//creating new employee record
		return employeeDao.insertEmployeeDetails(empDetails);
	}
	
	public void fetchAllEmployees() {
		List<Map<String, Object>> allEmployees = employeeDao.getAllEmployees();
		System.out.println("Emp-ID"+ "\t"+"Emp-Name"+"\t"+ "Emp-Email"+"\t\t"+ "Created-Date"+"\t"+ "Created By");
		//Using Java8 concept to retrieve employees
		allEmployees.forEach(eachMap -> {
			eachMap.entrySet().stream().forEach(eachEntry ->{
				System.out.print(eachEntry.getValue() +"\t");
			});
			System.out.println();
		}); 
	}
}
