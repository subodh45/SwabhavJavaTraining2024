package com.aurionpro.structural.decorators.test;
import com.aurionpro.structural.decorators.model.*;

public class CarServiceTest {
public static void main(String[] args) {
	
	ICarService car = new CarInspection();
	
	OilChange oilChange = new OilChange(car);
	
	System.out.println("oIl changing sost "+oilChange.getCost());
	
	WheelAlign wa = new WheelAlign(oilChange);
	System.out.println("Oil changing and wheel alignment charge "+wa.getCost());
    
	WheelAlign wa2 = new WheelAlign(car);
	System.out.println("wheel alignment charge "+wa2.getCost());
}
}
