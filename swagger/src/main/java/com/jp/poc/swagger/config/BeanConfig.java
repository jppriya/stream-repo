package com.jp.poc.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jp.poc.swagger.service.UserService;
import com.jp.poc.swagger.service.impl.UserServiceImpl;

@Configuration
public class BeanConfig {

	@Bean
	public UserService	 userService() {
		return new UserServiceImpl();
	}
}
