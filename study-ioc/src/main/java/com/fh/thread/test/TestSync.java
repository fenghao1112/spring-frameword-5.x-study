package com.fh.thread.test;

public class TestSync {

	public static void main(String[] args) {

		get();
		System.out.println("main");
	}

	public static void get() {
		Thread thread = new Thread(){
			@Override
			public void run() {
				try {
					Thread.sleep(10000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("run");
			}
		};
		thread.start();

		System.out.println("get.....");
	}
}
