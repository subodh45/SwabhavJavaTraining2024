package com.aurionpro.jdbc.SCM.test;
import com.aurionpro.jdbc.SCM.model.*;

public class ProductsTest {
public static void main(String[] args) {
	Products product = new Products();
	
	product.getConnection();
	product.displayDetails();
	product.insertDetails();
	product.displayDetails();
	
}
}
