package com.aurionpro.interthreading.model;

public class Consumer implements Runnable {
 	 InterThreadDemo q;

	public Consumer( InterThreadDemo q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		int i = 0;
		while (i<20) {
			q.get();
			i++;
		}
	}
}