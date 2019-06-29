package com.fh.project.config;

import com.fh.project.dao.Dao;
import com.fh.project.dao.UserDao;
import com.fh.project.dao.UserDao2;
import com.fh.project.imports.EnableMyImportSelector;
import com.fh.project.imports.MyImportBeanDefinitionRegistrar;
import com.fh.project.imports.MyImportSelector;
import com.fh.project.service.OrderServiceImpl;
import com.fh.project.service.UserService;
import com.fh.project.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.fh.project")
//@EnableMyImportSelector
@Import(MyImportBeanDefinitionRegistrar.class)
//@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public UserServiceImpl userService(){
		return new UserServiceImpl();
	}

	@Bean
	public OrderServiceImpl orderService(){
		userService();
		return new OrderServiceImpl();
	}
}
