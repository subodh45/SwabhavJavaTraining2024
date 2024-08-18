package com.aurionpro.jdbc.SCM.test;

import com.aurionpro.jdbc.SCM.model.OrderDetails;

public class OrderDetailsTest {
public static void main(String[] args) {
	
	OrderDetails orderDetail = new OrderDetails();
	
	orderDetail.getConnection();
	orderDetail.displayDetails();
	orderDetail.insertDetails();
	orderDetail.displayDetails();
	
}
}
