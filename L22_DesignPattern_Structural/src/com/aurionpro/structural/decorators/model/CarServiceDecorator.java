package com.aurionpro.structural.decorators.model;

public abstract class CarServiceDecorator implements ICarService {

	ICarService carObj;

	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}
	
	
}
