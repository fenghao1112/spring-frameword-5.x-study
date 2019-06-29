package com.fh.project.test;

import com.fh.project.config.AppConfig;
import com.fh.project.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(UserDao.class);
		// context.register(UserDao.class); 这种方式注册bean不需要加注解，但是要调用refresh()方法
		//context.register(AppConfig.class);
		//context.register(AppConfig2.class);
		//context.refresh();
		System.out.println(context.getBean(UserDao.class));
	}
}
