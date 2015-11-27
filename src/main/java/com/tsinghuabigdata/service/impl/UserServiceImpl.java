package com.tsinghuabigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsinghuabigdata.dao.UserRepository;
import com.tsinghuabigdata.model.User;
import com.tsinghuabigdata.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean registerUser(User user) {
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		return false;
	}
	
}
