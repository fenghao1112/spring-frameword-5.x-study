package com.fh.app.controller;

public class ClasspathResourceTest {

	private static final String DEFAULT_STRATEGIES_PATH = "DispatcherServlet1.properties";

	public static void main(String[] args) {
//		ClassPathResource resource = new ClassPathResource(DEFAULT_STRATEGIES_PATH);
//		System.out.println(resource.toString());
		Father father = new Father();
		father.onRefresh();
	}
}
