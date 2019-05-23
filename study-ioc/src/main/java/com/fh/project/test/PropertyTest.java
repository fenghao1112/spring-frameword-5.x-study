package com.fh.project.test;

import com.fh.project.config.DataSourcePropertiesWithJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class PropertyTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataSourcePropertiesWithJavaConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}

		System.out.println("创建容器");
		// 获取bean
		DataSourcePropertiesWithJavaConfig bean = applicationContext.getBean(DataSourcePropertiesWithJavaConfig.class);
		System.out.println(bean.toString());

		// 获取环境配置，可以通过这个对象获取到所有的所有的配置文件的数据
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("username");
		System.out.println(property);
	}
}
