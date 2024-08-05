package com.practice.test;

public class ThreadTest {
public static void main(String[] args) {
	
	Thread t1 = new Thread();
	Thread t2 = new Thread();
	t1.start();
	t2.start();
	
	for(int i=0;i<5;i++)
	{   System.out.println(t1.currentThread().getName());
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	System.out.println(t2.currentThread().getName());
	
	
}
}
