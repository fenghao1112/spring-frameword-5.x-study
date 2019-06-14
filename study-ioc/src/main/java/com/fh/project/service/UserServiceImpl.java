package com.fh.project.service;

import com.fh.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println("userService init...");
	}

	@Override
	public void query(){
		System.out.println("userService query...");
		userDao.query();
	}
}
