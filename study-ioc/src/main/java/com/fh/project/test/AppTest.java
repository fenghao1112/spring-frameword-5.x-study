package com.fh.project.test;

import com.fh.project.config.AppConfig;
import com.fh.project.config.AppConfig2;
import com.fh.project.dao.Dao;
import com.fh.project.dao.UserDao;
import com.fh.project.service.OrderServiceImpl;
import com.fh.project.service.UserService;
import com.fh.project.service.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AppTest {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		// context.register(UserDao.class); 这种方式注册bean不需要加注解，但是要调用refresh()方法
		context.register(AppConfig.class);
		//context.register(AppConfig2.class);
		context.refresh();

		//context.getBean(UserServiceImpl.class);
		//context.getBean(OrderServiceImpl.class);

	}
}
