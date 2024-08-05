package com.aurionpro.interthreading.model;

public class Producer implements Runnable {
	 InterThreadDemo q;

	public Producer( InterThreadDemo q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (i<20) {
			q.put(i++);
		}
	}
}
