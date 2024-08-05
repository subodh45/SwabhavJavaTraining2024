package com.aurionpro.thread.test;
import com.aurionpro.thread.model.*;

public class MyThreadTest {
public static void main(String[] args) {
	
	Thread main = new Thread();
	System.out.println(main.getName());
	
	MyThread mythread = new MyThread("mythread1");
	MyThread mythread2 = new MyThread("mythread2");
	MyThread mythread3 = new MyThread("mythread3");
	MyThread mythread4 = new MyThread("mythread4");
	
	
	try {
		mythread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
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
