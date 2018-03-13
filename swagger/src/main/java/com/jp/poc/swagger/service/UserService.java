package com.jp.poc.swagger.service;

import java.util.List;

import com.jp.poc.swagger.model.User;

public interface UserService {
	
	public List<User> getUsers();

	public User getUser(Integer userId);

}
