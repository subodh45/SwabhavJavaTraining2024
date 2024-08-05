package com.Aurionpro.Model;

public interface Payment {

	public abstract void payBill();
	
	public abstract void redeem();
	
	default void perimeter() {
		System.out.println("its Perimeter .");	
	}
	
	static void balance() {		
		System.out.println("balance .");
	}
}
