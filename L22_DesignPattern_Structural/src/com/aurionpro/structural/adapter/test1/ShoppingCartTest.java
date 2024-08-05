package com.aurionpro.structural.adapter.test1;
import java.util.LinkedList;
import java.util.List;

import com.aurionpro.structural.adapter.model1.*;

public class ShoppingCartTest {

	public static void main(String[] args) {
		
		Hat hat = new Hat("Hat","hat2",90.0, 6);
		
		IItems Ihat = new HatAdapter(hat);
		
		IItems biscuit = new Biscuit("biscuit", 100);
		IItems bourbon = new Biscuit("bourbon", 130);
		
		List<IItems>itemsList = new LinkedList();
		itemsList.add(Ihat);
		itemsList.add(biscuit);
		
		ShoppingCart shoppingCart = new ShoppingCart(itemsList);	
		System.out.println( "Total cart price is "+shoppingCart.getCartPrice());
		
		shoppingCart.addItemToCart(bourbon);		
		System.out.println( "Total cart price is "+shoppingCart.getCartPrice());
		
	    shoppingCart.printcart();
	    
			
		
		
	}
}
