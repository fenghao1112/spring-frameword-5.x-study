package com.fh.app.test;

import com.fh.app.config.AppConfig;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class SpringBootApplicationTest {

	public static void main(String[] args) {
		// 初始化spring ioc
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext =
				new AnnotationConfigWebApplicationContext();
		annotationConfigWebApplicationContext.register(AppConfig.class);
		annotationConfigWebApplicationContext.refresh();

		File base = new File(System.getProperty("java.io.tmpdir"));
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		try {
			// addWebapp 表示这是一个web项目，tomcat会调用webApplicationInitlizer接口的方法
			// Context tomcatContext = tomcat.addWebapp("/",base.getAbsolutePath());
			// addContext 表示这是一个jar项目
			Context tomcatContext = tomcat.addContext("/", base.getAbsolutePath());
			// 创建一个servlet
			DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);
			Tomcat.addServlet(tomcatContext,"fhServlet",dispatcherServlet).setLoadOnStartup(1);
			tomcatContext.addServletMapping("/","fhServlet");
			tomcat.start();
			tomcat.getServer().await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
