package com.aurionpro.structural.decorators.model;

public class WheelAlign extends CarServiceDecorator {

	public WheelAlign(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	
	public double getCost()
	{
		return 1500 + carObj.getCost();
	}

}
