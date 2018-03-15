package com.jp.poc.exceptionhandling.service;

import java.util.List;
import java.util.Optional;

import com.jp.poc.exceptionhandling.model.User;

public interface UserService {

	Optional<User> getUser(Integer userId);

	List<User> getUsers();

}
