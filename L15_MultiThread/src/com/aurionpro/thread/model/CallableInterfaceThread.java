			package com.aurionpro.thread.model;

import java.util.concurrent.Callable;

public class CallableInterfaceThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return (int)(Math.random()*1000);
	}

	
	

}
