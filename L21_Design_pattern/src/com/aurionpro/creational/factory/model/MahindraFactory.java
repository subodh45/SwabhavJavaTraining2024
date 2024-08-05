package com.aurionpro.creational.factory.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
		 ICar car = new Mahindra();
		return car;
	}

	
}
