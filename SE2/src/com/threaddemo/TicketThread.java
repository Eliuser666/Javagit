package com.threaddemo;

public class TicketThread implements Runnable {
	int tickets = 100;
	Object obj=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
		synchronized (obj) {
			if (tickets > 0)
				System.out.println(Thread.currentThread().getName() + ":" + tickets--);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}

	}

}
