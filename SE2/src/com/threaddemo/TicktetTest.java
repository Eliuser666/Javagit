package com.threaddemo;

public class TicktetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketThread tt=new TicketThread();
		Thread td1=new Thread(tt);
		td1.setName("´°¿Ú1");
		Thread td2=new Thread(tt);
		td2.setName("´°¿Ú2");
		Thread td3=new Thread(tt);
		td3.setName("´°¿Ú3");
		td1.start();
		td2.start();
		td3.start();
	}

}
