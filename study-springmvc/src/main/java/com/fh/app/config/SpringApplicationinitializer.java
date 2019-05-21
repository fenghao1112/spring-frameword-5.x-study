package com.fh.app.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class SpringApplicationinitializer implements WebApplicationInitializer  {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// spring 一般在这里初始化spring容器

//		AnnotationConfigWebApplicationContext webApplicationContext = new
//				AnnotationConfigWebApplicationContext();
//		webApplicationContext.register(AppConfig.class);
//		webApplicationContext.refresh();
//
//		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//		ServletRegistration.Dynamic registration = servletContext.addServlet("xx", dispatcherServlet);
//		registration.setLoadOnStartup(1);
//		registration.addMapping("/");

	}
}
