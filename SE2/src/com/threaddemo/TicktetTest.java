package com.threaddemo;

public class TicktetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketThread tt=new TicketThread();
		Thread td1=new Thread(tt);
		td1.setName("����1");
		Thread td2=new Thread(tt);
		td2.setName("����2");
		Thread td3=new Thread(tt);
		td3.setName("����3");
		td1.start();
		td2.start();
		td3.start();
	}

}
