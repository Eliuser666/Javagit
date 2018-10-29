package com.threaddemo;

public class MyThread3 implements Runnable {
int num;
 public MyThread3(int num) {
	// TODO Auto-generated constructor stub
	 this.num=num;
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
