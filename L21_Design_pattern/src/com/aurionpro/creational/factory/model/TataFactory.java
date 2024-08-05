package com.aurionpro.creational.factory.model;

public class TataFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		ICar car = new Tata();
		return car;
	}

}
