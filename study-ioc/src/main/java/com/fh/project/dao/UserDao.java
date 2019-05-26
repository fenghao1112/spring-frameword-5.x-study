package com.fh.project.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
public class UserDao implements Dao{

	public UserDao() {
		System.out.println("init userDao");
	}

	public void query(){
		System.out.println("userDao ....");
	}

}
