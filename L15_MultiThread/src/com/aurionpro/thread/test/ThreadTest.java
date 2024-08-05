package com.aurionpro.thread.test;

public class ThreadTest {
public static void main(String[] args) {
	
	Thread thread = Thread.currentThread();
	
	System.out.println(thread);
	thread.setName("Mainthread");
	
	for(int i=5;i>0;i--)
	{
		System.out.println(i + " "+ thread.currentThread().getName());
		try {
			thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
