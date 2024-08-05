package com.aurionpro.thread.test;
import com.aurionpro.thread.model.RunnableThread;

public class RunnableThreadTest {
public static void main(String[] args) {
	
	RunnableThread thread1 = new RunnableThread("Thread1");
	RunnableThread thread2 = new RunnableThread("Thread2");
	RunnableThread thread3 = new RunnableThread("Thread3");
	
	thread1.getThread().setPriority(Thread.MAX_PRIORITY);
	thread3.getThread().setPriority(Thread.NORM_PRIORITY);
	thread2.getThread().setPriority(Thread.MIN_PRIORITY);
	
	System.out.println(thread1.getThread().isAlive());
	System.out.println(thread2.getThread().isAlive());
	System.out.println(thread3.getThread().isAlive());
	
	for(int i=5;i>0;i--)
	{
		System.out.println(i + " "+ Thread.currentThread().getName());
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	try {
		thread1.getThread().join();
		thread2.getThread().join();
		thread3.getThread().join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(thread1.getThread().isAlive());
	System.out.println(thread2.getThread().isAlive());
	System.out.println(thread3.getThread().isAlive());
}
}
