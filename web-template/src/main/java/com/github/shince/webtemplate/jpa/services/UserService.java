package com.github.shince.webtemplate.jpa.services;

import java.util.List;

import com.github.shince.entities.User;

public interface UserService {
	User findOne(Long id);
	List<User> findAllUser();
	User createUser(User user);
	User updateUser(User user);
	User findUserByName(String name);
}
