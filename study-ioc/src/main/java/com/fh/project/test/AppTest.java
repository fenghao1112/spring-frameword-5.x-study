package com.fh.project.test;

import com.fh.project.config.AppConfig;
import com.fh.project.config.AppConfig2;
import com.fh.project.dao.Dao;
import com.fh.project.dao.UserDao;
import com.fh.project.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AppTest {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		//BeanFactory beanFactory = (BeanFactory) context;
		// context.register(UserDao.class); 这种方式注册bean不需要加注解，但是要调用refresh()方法
		context.register(AppConfig.class);
		//context.register(AppConfig2.class);
		context.refresh();

		UserService userService = (UserService)context.getBean("userServiceImpl");
		userService.query();
		//context.getBean(UserService.class).query();
//		Dao userDao = (Dao) context.getBean("userDao");
//		userDao.query();
		/*UserDao userDao = context.getBean(UserDao.class);
		userDao.query();
		UserDao3  userDao3 = (UserDao3) context.getBean("com.fh.project.dao.UserDao3");
		userDao3.query();*/

	}
}
