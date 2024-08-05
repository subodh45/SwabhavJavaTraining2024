package com.Aurionpro.list.model;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDefault {
public static void main(String[] args) {
	
	PriorityQueue<Integer>priorityqueue =new PriorityQueue<Integer>();
	 
	priorityqueue.add(6); 
	priorityqueue.add(9); 
	priorityqueue.add(2);
	priorityqueue.add(3);
	priorityqueue.add(4);
	priorityqueue.add(5);
	priorityqueue.add(10);
	
	System.out.println(priorityqueue);
	
	priorityqueue.remove();
	priorityqueue.remove();
	priorityqueue.remove();
	
	Iterator<Integer> iterator = priorityqueue.iterator();
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next() );
	}
	
}

}
