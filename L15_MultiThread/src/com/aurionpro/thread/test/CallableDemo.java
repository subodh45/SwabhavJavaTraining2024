package com.aurionpro.thread.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.thread.model.CallableInterfaceThread;

public class CallableDemo {
public static void main(String[] args) {
	
	ExecutorService service = Executors.newCachedThreadPool();
	
	//Future<Integer>future =service.submit( new CallableInterfaceThread());
	
	List<CallableInterfaceThread> tasks = new ArrayList<CallableInterfaceThread>();
	
    tasks.add(new CallableInterfaceThread());
    tasks.add(new CallableInterfaceThread());
    tasks.add(new CallableInterfaceThread());
    tasks.add(new CallableInterfaceThread());
    tasks.add(new CallableInterfaceThread());
	
	try {
		//List<Future<Integer>> futures=service.invokeAll(tasks);
		List<Future<Integer>> futures=service.invokeAll(tasks);
		for(Future<Integer> future :futures)
		{
			System.out.println(future.get());
		}
		
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
