package com.fh.project.aop;

public class TestJdkDynamicProxy {

	public static void main(String[] args) {

		// jdk 动态代理测试
		//Subject proxy =  new JdkDynamicProxyHandler(new TargetSubject()).getProxy();
		Subject proxy =  (Subject)new JdkDynamicProxyHandler(new TargetSubject()).getProxy();
		proxy.query();

	}

}
