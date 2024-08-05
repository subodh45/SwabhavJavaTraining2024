package com.aurionpro.structural.adapter.model1;

import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

	List<IItems> cartItems;
	
	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}

	
	
	public List<IItems> getCartItems() {
		return cartItems;
	}



	public void setCartItems(List<IItems> cartItems) {
		this.cartItems = cartItems;
	}



	public void addItemToCart(IItems item)
	{
		cartItems.add(item);
	}
	
	
	public void printcart()
	{
		 
		this.cartItems.stream().forEach((IItems) -> System.out.println(IItems));
//		for(IItems items:  cartItems)
//		{
//			System.out.println(items);
//		}
		
	}
	
	public double getCartPrice()
	{   
	  double cartPrice	=cartItems.stream()
		.map((cartItems)-> cartItems.getItemPrice())
		.reduce(0.0,(number1,number2) -> number1+number2);
		
		return cartPrice ;
	}


	public String toString() {
		return "ShoppingCart [cartItems=" + cartItems + "]";
	}
	
	
}
