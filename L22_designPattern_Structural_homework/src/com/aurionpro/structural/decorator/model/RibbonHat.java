package com.aurionpro.structural.decorator.model;

public class RibbonHat extends HatDecorator {

	public RibbonHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName() +" and Ribbon Hat.";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice()+50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription() + "This also include ribbon.";
	}

}
