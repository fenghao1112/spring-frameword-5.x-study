package com.fh.project.test;

import com.fh.project.config.AppConfig;
import com.fh.project.config.AppConfig2;
import com.fh.project.dao.Dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		// context.register(UserDao.class); 这种方式注册bean不需要加注解，但是要调用refresh()方法
		context.register(AppConfig.class);
		context.register(AppConfig2.class);
		context.refresh();

		//context.getBean(UserService.class).query();
//		Dao userDao = (Dao) context.getBean("userDao");
//		userDao.query();
		/*UserDao userDao = context.getBean(UserDao.class);
		userDao.query();
		UserDao3  userDao3 = (UserDao3) context.getBean("com.fh.project.dao.UserDao3");
		userDao3.query();*/

	}
}
