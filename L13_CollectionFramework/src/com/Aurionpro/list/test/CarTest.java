package com.Aurionpro.list.test;
import com.Aurionpro.list.model.*;
import java.util.*;

public class CarTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	List<Car> cars = new ArrayList<Car>();
	
	System.out.println("enter Number of car");
	int size = scanner.nextInt();
	
	readCar(size,scanner,cars);
	
	//access element
	getcar(cars);
	
	//get High mileage car detail
	System.out.println("Top Mileage car.");
	getTopMileage(cars);
	
}

private static void getTopMileage(List<Car>cars) {
	// TODO Auto-generated method stub
	Car top = cars.get(0);
	for(Car car:cars)
	{   
		if(top.getMileage()<car.getMileage())
		 top =car;
	}
	
	System.out.println(top);
}

private static void getcar(List<Car>cars) {
	// TODO Auto-generated method stub
	for(Car car:cars)
	{
		System.out.println(car);
	}
	
}

private static void readCar(int size, Scanner scanner, List<Car>cars) {
	
	for(int n=0;n<size;n++)
	{
		System.out.println("enter car id ");
		int carId = scanner.nextInt();
		
		System.out.println("enter company name");
		String companyName= scanner.next();
		
		System.out.println("enter price ");
		int price = scanner.nextInt();
		
		System.out.println("enter mileage ");
		double mileage = scanner.nextDouble();
		
		cars.add(new Car(carId,companyName,price,mileage));
	}
	
}
}
