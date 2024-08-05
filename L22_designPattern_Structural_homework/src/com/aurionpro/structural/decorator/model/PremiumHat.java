package com.aurionpro.structural.decorator.model;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "PremiumHat";
	}

	@Override
	public int getPrice() {
		
		return 200;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "desc for premium hat.";
	}

}
