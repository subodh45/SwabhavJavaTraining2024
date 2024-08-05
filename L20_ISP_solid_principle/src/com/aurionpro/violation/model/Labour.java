package com.aurionpro.violation.model;

public class Labour implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("labour start working ");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("labour stope working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lunch break");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("drink");
	}

}
