package com.aurionpro.interthreading;
import com.aurionpro.interthreading.model.*;

class InterThreadCommunicationDemo {
	public static void main(String args[]) {
		 InterThreadDemo q = new  InterThreadDemo();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}
		}
	 