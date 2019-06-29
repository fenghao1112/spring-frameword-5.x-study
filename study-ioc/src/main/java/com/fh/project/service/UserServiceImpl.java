package com.fh.project.service;

import com.fh.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl Construct...");
	}

	@Override
	public void query(){
		System.out.println("UserServiceImpl query...");
	}
}
