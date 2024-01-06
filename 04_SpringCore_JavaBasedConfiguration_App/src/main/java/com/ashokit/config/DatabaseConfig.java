package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.beans.OracleDatabase;

@Configuration
public class DatabaseConfig {
	

	@Bean
	public OracleDatabase getOracle() {
		return new OracleDatabase();
	}
	

}
