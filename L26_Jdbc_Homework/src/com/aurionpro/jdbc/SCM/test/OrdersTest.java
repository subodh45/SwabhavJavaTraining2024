package com.aurionpro.jdbc.SCM.test;

import com.aurionpro.jdbc.SCM.model.Orders;

public class OrdersTest {
public static void main(String[] args) {
	
	Orders order = new Orders();
	
	order.getConnection();
	order.displayDetails();
	order.insertDetails();
	order.displayDetails();
	
}
}
