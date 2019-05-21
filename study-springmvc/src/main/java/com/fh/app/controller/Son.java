package com.fh.app.controller;

public class Son extends Father {


	@Override
	protected void onRefresh() {
		System.out.println("子类。。。");
	}
}
