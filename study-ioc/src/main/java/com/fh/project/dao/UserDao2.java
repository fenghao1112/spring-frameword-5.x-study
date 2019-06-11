package com.fh.project.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Repository
@Primary
@Priority(10)
public class UserDao2 implements Dao{

	public void query(){
		System.out.println("UserDao2 query....");
	}

}
