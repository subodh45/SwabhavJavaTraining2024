package com.Aurionpro.Inheritance;

public class Car extends FourWheeler {

	private int price;
	
	public Car(String companyName,int mileage,int price)
	{
		super(companyName,mileage);
		this.price =price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", Mileage=" + getMileage() + ", Company=" + getCompanyName() + "]";
	}
	
	
}
