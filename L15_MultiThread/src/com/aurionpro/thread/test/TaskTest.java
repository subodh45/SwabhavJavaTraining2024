package com.aurionpro.thread.test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.thread.model.*;

public class TaskTest {
public static void main(String[] args) {
	
	//for(int i=0;i<10;i++)
	//{
		//Thread thread =new Thread(new Task());
		//thread.start();
	//}
	
	int ProcessorCount = Runtime.getRuntime().availableProcessors();
	System.out.println(ProcessorCount);
	
	//10 is number of thread .
	//ExecutorService service = Executors.newFixedThreadPool(10);
	ExecutorService service = Executors.newCachedThreadPool();
	
	//ExecutorService service = Executors.newSingleThreadExecutor();
	
	for(int i=0;i<1000;i++)
	{
		service.execute(new Task());
	}
}
}
