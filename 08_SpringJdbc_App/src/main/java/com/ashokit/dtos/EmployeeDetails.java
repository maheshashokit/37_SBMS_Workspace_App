package com.ashokit.dtos;

import java.util.Date;

public class EmployeeDetails {
	
	private Integer employeeId;
	
	private String name;
	
	private String email;
	
	private Date createdDate;
	
	private String createdBy;
	
	public EmployeeDetails() {
		System.out.println("EmployeeDetails Class Constructor...");
	}

	public EmployeeDetails(Integer employeeId, String name, String email, Date createdDate, String createdBy) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + "]";
	}
}
