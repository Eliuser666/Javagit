package com.threaddemo;

public class MyThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 mt3 = new MyThread3(100);
		Thread td = new Thread(mt3);
		td.setName("����");
		td.start();
		
		
		Thread td2 = new Thread(mt3);
		td2.setName("����");
		td2.start();
		//������һ��Runnable����
		
		
	}

}
