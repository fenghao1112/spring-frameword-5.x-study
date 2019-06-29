package com.fh.project.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Priority;

@Component
//@Priority(1)
public class UserDao implements Dao{

	public UserDao() {
		System.out.println("init userDao");
	}

	public void query(){
		System.out.println("userDao ....");
	}

}
