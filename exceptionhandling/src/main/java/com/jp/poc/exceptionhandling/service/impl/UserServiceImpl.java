package com.jp.poc.exceptionhandling.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jp.poc.exceptionhandling.model.User;
import com.jp.poc.exceptionhandling.service.UserService;

/**
 * @author jayapriya.r
 *
 */
@Service
public class UserServiceImpl implements UserService {

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
	public Optional<User> getUser(Integer userId) {
		List<User> users = this.getUsers();
		return users.stream().filter(u-> u.getUserId() == userId).findFirst();
	}

}
