package com.fh.project.service;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println("userService init...");
	}

	@Override
	public void query(){
		System.out.println("userService query...");
	}
}
