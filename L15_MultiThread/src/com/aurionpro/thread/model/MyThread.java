package com.aurionpro.thread.model;

public class MyThread extends Thread{

	public MyThread(String name )
	{
		super(name);
		start();
	}
	
	public void run()
	{
		
		for(int i=5;i>0;i--)
		{
			System.out.println(i + " "+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
