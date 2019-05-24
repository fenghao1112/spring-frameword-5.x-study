package com.fh.project.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyHandler implements InvocationHandler {

	private Object target;

	public JdkDynamicProxyHandler(Object target){
		this.target =  target;
	}

	public  Object getProxy(){
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	/*
	method : 目标方法
	args: 目标方法的参数
	proxy : 代理对象
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before do something...");
		Object invoke = method.invoke(target, args);
		System.out.println("after do something...");
		return invoke;
	}
}
