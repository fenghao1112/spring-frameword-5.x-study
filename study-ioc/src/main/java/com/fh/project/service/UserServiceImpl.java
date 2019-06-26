package com.fh.project.service;

import org.springframework.stereotype.Service;

//@Service
public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println("UserServiceImpl Construct...");
	}

	@Override
	public void query(){
		System.out.println("UserServiceImpl query...");
	}
}
