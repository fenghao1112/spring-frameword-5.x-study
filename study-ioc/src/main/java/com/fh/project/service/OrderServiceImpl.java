package com.fh.project.service;

import com.fh.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service
public class OrderServiceImpl implements UserService{

	public OrderServiceImpl() {
		System.out.println("OrderServiceImpl construct...");
	}

	@Override
	public void query(){
		System.out.println("OrderServiceImpl query...");
	}
}
