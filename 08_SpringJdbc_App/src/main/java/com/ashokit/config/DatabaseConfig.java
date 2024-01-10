package com.ashokit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value="database.properties")
@ComponentScan(basePackages = "com.ashokit")
public class DatabaseConfig {
	
	@Value("${MySqlDriverClassName}")
	private String driverClassName;
	
	@Value("${MySqlDriverUrl}")
	private String driverUrl;
	
	@Value("${MySqlUsername}")
	private String databaseUserName;
	
	@Value("${MySqlPassword}")
	private String databasePassword;
	
	//creating datasource object
	@Bean
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		dmd.setDriverClassName(driverClassName);
		dmd.setUrl(driverUrl);
		dmd.setUsername(databaseUserName);
		dmd.setPassword(databasePassword);
		
		return dmd;
	}
	
	//creating the JdbcTemplate object
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		
		return jt;		
	}

}
