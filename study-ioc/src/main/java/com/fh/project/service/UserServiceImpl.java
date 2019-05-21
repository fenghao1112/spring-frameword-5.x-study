package com.fh.project.service;

import com.fh.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public void query() {
		userDao.query();
	}
}
