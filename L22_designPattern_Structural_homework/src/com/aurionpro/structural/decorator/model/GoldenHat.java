package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator {
	
	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName() + " and GoldenHat .";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice() +200;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription() + " it includes Golden design.";
	}

}
