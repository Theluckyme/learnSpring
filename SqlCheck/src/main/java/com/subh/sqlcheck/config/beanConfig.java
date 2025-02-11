package com.subh.sqlcheck.config;

import org.springframework.context.annotation.Configuration;

import com.subh.sqlcheck.AuthServ.AuthServer;
import com.subh.sqlcheck.services.UserServices;

@Configuration
public class beanConfig {
	UserServices getService() {
		return new AuthServer();
	}
}
