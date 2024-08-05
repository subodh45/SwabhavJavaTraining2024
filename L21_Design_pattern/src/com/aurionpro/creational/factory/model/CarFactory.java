package com.aurionpro.creational.factory.model;

public class CarFactory  {

	public ICar MeakeCar(Cars carName)
	{
		ICar car=null;
		if(carName == Cars.MARUTI)
			car = new Maruti();
		if(carName ==Cars.TATA)
			car = new Tata();	
		if(carName == Cars.MAHINDRA)
	    car = new Mahindra();
		
	   return car;
	}
}
