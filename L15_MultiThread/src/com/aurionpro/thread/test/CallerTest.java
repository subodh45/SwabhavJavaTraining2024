package com.aurionpro.thread.test;

import com.aurionpro.thread.model.CallMe;
import com.aurionpro.thread.model.Caller;

public class CallerTest {
public static void main(String[] args) {
	
	CallMe target = new CallMe();
	Caller caller1=new Caller("Hello",target);
	Caller caller2 =new Caller("Subodh",target);
	Caller caller3 =new Caller("Magar",target);
	
	caller1.getThread().setPriority(Thread.MAX_PRIORITY);
	
	
	try {
		caller1.getThread().join();
		caller2.getThread().join();
		caller3.getThread().join();
		
	}catch(InterruptedException exception )
	{
		System.out.println("exception "+ exception);
	}
}
}
