package com.Aurionpro.InheritanceTest;
import com.Aurionpro.Inheritance.*;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car("Tatamotors",25,4500000);
		
		car.setCompanyName("TataMotors");
		car.setMileage(40);
		car.setPrice(450000);
	
		
		System.out.println(car.toString());
	}
}
