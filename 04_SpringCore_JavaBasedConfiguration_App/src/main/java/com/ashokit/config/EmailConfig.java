package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.beans.MailServer;

@Configuration
public class EmailConfig {
	
	@Bean
	public MailServer getMailServer() {
		return new MailServer();
	}

}
