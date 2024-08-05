package com.aurionpro.structural.Facade.model;

public class ItalianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		
		IMenu italianMenu = new ItalianMenu();
		return italianMenu;
	}

	
}
