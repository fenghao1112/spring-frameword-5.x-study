package com.fh.project.service;

import com.fh.project.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	//@Autowired
	private Dao userDao3;
	//@Autowired
	public UserServiceImpl(Dao userDao){
		this.userDao3 = userDao;
	}

	@Autowired
	void setXxx(Dao userDao){
		this.userDao3 = userDao;
	}

	public UserServiceImpl() {
		System.out.println("userService init...");
	}

	@Override
	public void query(){
		userDao3.query();
		System.out.println("userService query...");
	}
}
