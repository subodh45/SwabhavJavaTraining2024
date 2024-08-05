package com.aurionpro.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("robot start working.");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("robot stop working ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("lunch break for robot");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("drink break for robot");
	}

}
