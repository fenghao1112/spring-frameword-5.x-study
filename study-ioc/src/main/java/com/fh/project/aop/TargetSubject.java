package com.fh.project.aop;

public class TargetSubject implements Subject {
	@Override
	public void query() {
		System.out.println("TargetSubject  do something...");
	}
}
