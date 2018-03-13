package com.jp.poc.swagger.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.poc.swagger.model.User;
import com.jp.poc.swagger.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<User> getUsers() {
		List<User> users= new ArrayList<User>();
		User user = new User();
		user.setAddress("Bangalore");
		user.setUserName("John");
		user.setUserId(1);
		User user1= new User(1,"Smith", "Chennai");
		users.add(user);
		users.add(user1);
		return users;
	}

	@Override
	public User getUser(Integer userId) {
		List<User> users = this.getUsers();
		return users.stream().filter(u-> u.getUserId() == userId).findFirst().get();
	}

}
