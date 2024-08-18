package com.aurionpro.jdbc.SCM.test;

import com.aurionpro.jdbc.SCM.model.Inventory;

public class InventoryTest {
public static void main(String[] args) {
	
	Inventory inventory = new Inventory();
	
	inventory.getConnection();
	inventory.displayDetails();
	inventory.insertDetails();
	inventory.displayDetails();
}
}
