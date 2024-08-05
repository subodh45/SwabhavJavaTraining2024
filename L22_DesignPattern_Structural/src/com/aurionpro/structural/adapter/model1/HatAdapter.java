package com.aurionpro.structural.adapter.model1;

public class HatAdapter implements IItems {

	Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getLongName()+hat.getShortName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBasicPrice();
	}

	@Override
	public String toString() {
		return " hat= " + hat.basicPrice + hat.getLongName()+ "]";
	}
	
	
	
	
}

