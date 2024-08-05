package com.Aurionpro.Inheritance;

public class FourWheeler extends Vehicle {
	
	private int mileage;
	
	public FourWheeler(String companyName,int mileage)
	{
		super(companyName);
		this.mileage =mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
