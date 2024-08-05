package com.aurionpro.test;

import java.util.function.Supplier;

public class ISupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier =() -> (int)(Math.random()*1000);
		//Supplier<Double> supplier =() -> (Math.random()*1000);
		
		System.out.println("Number generated is "+supplier.get());
		
	}
}
