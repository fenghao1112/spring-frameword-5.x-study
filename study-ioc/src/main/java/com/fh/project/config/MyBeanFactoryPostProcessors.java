package com.fh.project.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessors implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("自定义的BeanFactoryPostProcessor,可以拿到beanFactory ");
		GenericBeanDefinition userServiceImpl = (GenericBeanDefinition) beanFactory.getBeanDefinition("userServiceImpl");
		//userServiceImpl.setAutowireMode(1);
	}
}
