package com.threaddemo;

public class ThreadDemo {
	public static void main(String[] args) {

		/*
		 * MyThread mythread=new MyThread(); mythread.setName("张三");
		 * mythread.start(); MyThread mythread1=new MyThread();
		 * mythread1.setName("老王"); mythread1.start();
		 */
		MyThread3 mt = new MyThread3(100);
		Thread t=new Thread(mt);
		t.setName("李四");
		t.start();
		MyThread3 mt2 = new MyThread3(200);
		Thread t2=new Thread(mt2);
		t2.setName("王五");
		t2.start();

	}
}
