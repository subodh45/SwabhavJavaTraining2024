package com.aurionpro.thread.model;

public class CallMe {

	// used synchronized before method to make it synchronised.
	 public synchronized void call(String message)
	{
		System.out.print("[ "+ message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
