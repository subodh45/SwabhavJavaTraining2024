package com.Aurionpro.Test;
import com.Aurionpro.Model.*;

public class BaseTest {

	public static void main(String[] args) {
		
		Base base;
		base= new Base();
		base.display();
		
		Derived derived = new Derived();
		derived.display();
		
		base =derived;
		
		base.display();
		
		Derived2 derived2 = new Derived2();
		derived2.display();
		
		base =derived2;
		base.display();
		
	}
}
