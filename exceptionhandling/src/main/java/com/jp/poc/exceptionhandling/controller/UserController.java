package com.jp.poc.exceptionhandling.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jp.poc.exceptionhandling.exception.UserNotFoundException;
import com.jp.poc.exceptionhandling.model.User;
import com.jp.poc.exceptionhandling.service.UserService;

/**
 * @author jayapriya.r
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") String userId){
		Optional<User> user = userService.getUser(Integer.parseInt(userId));
		if(!user.isPresent()){
			throw new UserNotFoundException("User Id " + userId);
		}
		return user.get();
	}
	
	@GetMapping(value = "/users")
	public List<User> getAllUser() {
		return userService.getUsers();
	}
}
