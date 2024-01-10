package com.ashokit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.dtos.EmployeeDetails;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertEmployeeDetails(EmployeeDetails empDetails) {
		
		int rowCount = jdbcTemplate.update("insert into ashokit_emps values(?,?,?,?,?)",
				empDetails.getEmployeeId(),
				empDetails.getName(),
				empDetails.getEmail(),
				new java.sql.Date(new java.util.Date().getTime()),
				empDetails.getCreatedBy());
		
		return rowCount > 0;
	}
	
	
	public List<Map<String,Object>> getAllEmployees(){
		 //getting all employees
		 List<Map<String, Object>> allEmployees = jdbcTemplate.queryForList("select * from ashokit_emps");
		 return allEmployees;
	}

}
