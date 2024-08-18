package com.aurionpro.jdbc.transactionManagement.test;

import com.aurionpro.jdbc.transactionManagement.model.TransactionManagementModel;

public class TransactionManagementTest {
public static void main(String[] args) {
	
	TransactionManagementModel transactionModel = new TransactionManagementModel();
	transactionModel.getConnection();
	
	transactionModel.GetDetails();
	transactionModel.TransactionMethod();
	transactionModel.GetDetails();
}
}
