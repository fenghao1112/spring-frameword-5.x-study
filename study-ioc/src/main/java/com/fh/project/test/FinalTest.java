package com.fh.project.test;

import com.fh.project.config.DataSourcePropertiesWithJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class FinalTest {

	public static final String s = "test";

	public static void main(String[] args) {
		System.out.println(s);
		String s2 = s.concat("2test2");
		System.out.println(s2);

	}
}
