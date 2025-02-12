package com.subh.sqlcheck.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subh.sqlcheck.AuthServ.AuthServer;
import com.subh.sqlcheck.services.UserServices;

@Configuration
public class beanConfig {
	@Bean
	UserServices getService() {
		return new AuthServer();
	}
}
