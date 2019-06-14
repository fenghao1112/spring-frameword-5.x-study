package com.fh.project.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;

@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor{

	@Nullable
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if("userServiceImpl".equals(beanName)){
			try {
				Object o = beanClass.newInstance();
				return o;
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if("userServiceImpl".equals(beanName)){
				System.out.println("beanPostProcessor....");

		}

		return true;
	}


}
