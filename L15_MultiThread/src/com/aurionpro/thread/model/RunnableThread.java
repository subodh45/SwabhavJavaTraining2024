package com.aurionpro.thread.model;

public class RunnableThread implements Runnable {
   
	private Thread thread;
	
	public RunnableThread(String name)
	{   super();
	    thread = new Thread(this,name);
		thread.start();
	}
	
	public Thread getThread() {
		return thread;
	}



	public void setThread(Thread thread) {
		this.thread = thread;
	}



	public void run() {
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
