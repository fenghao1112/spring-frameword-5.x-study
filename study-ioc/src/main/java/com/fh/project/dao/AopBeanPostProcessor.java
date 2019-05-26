package com.fh.project.dao;

import com.fh.project.imports.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import java.lang.reflect.Proxy;


public class AopBeanPostProcessor implements BeanPostProcessor {

	@Nullable
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),
				new Class[]{Dao.class},new MyInvocationHandler(bean));
		return bean;
	}

	@Nullable
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

}
