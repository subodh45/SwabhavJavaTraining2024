package com.aurionpro.structural.decorator.model;

public class StandardHat implements IHat{

	
	public String getName() {

		return "Standard Hat";
	}

	
	public int getPrice() {
		
		return 100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "standard quality hat desc.";
	}

}
