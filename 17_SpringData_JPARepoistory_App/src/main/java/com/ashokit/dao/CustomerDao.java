package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.enities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
}
