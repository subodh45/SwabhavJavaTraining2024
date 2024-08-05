package com.aurionpro.creational.factory.test;
import com.aurionpro.creational.factory.model.*;

public class ICarTest {
public static void main(String[] args) {
	
	CarFactory car = new CarFactory();
	ICar car2 = car.MeakeCar(Cars.MAHINDRA);
	car2.start();
	car2.stop();
	
	 car2 = car.MeakeCar(Cars.MARUTI);
	car2.start();
	car2.stop();
	
	System.out.println("Abstarctfactory example ");
	
	
	//Abstarct Factory extension test
	
	ICarFactory carFactory;
	
	carFactory = new TataFactory();
	
	ICar car3 = carFactory.makeCar();
	
	car3.start();
	car3.stop();
	
	
}
}
