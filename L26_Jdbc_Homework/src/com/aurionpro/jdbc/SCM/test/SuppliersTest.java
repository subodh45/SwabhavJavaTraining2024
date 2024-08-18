package com.aurionpro.jdbc.SCM.test;
import com.aurionpro.jdbc.SCM.model.*;

public class SuppliersTest {
public static void main(String[] args) {
	
	Suppliers supplierConnect = new Suppliers();
	
	supplierConnect.getConnection();
	supplierConnect.displayDetails();
	supplierConnect.insertDetails();
	supplierConnect.displayDetails();
}
}
