package com.aurionpro.structural.Facade.model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		IMenu indianMenu = new IndianMenu();
		return indianMenu ;
	}

}
