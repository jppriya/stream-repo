package com.jp.poc.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jp.poc.swagger.model.User;
import com.jp.poc.swagger.service.UserService;

@RestController
public class SwaggerController {
	@Autowired
	private UserService userService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/users")
	public @ResponseBody List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/users/{userId}")
	public @ResponseBody User getUser(@PathVariable("userId") Integer userId) {
		return userService.getUser(userId);
	}

}
