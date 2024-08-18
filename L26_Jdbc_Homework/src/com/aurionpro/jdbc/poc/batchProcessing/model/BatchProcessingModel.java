package com.aurionpro.jdbc.poc.batchProcessing.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingModel {

	Connection connection=null;
	Statement statement=null;
	PreparedStatement preparedStatement;
	
	public void getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			System.out.println("Connected Successfully.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void GetDetails()
	{
		try {
			statement = connection.createStatement();
			ResultSet students= statement.executeQuery("select * from students");
			
			
			
			while(students.next())
			{
				System.out.println(students.getInt(1)+ " "+ students.getString(2) + " "+ students.getInt("age")+" "+ students.getDouble(4));				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void batchMethod()
	{
		try {
			statement = connection.createStatement();
			connection.setAutoCommit(false); 
			
			statement.addBatch("insert into students values(5,'jateen',22,89.00)");
			statement.addBatch("insert into students values(6,'axar',22,89.00)");
			statement.addBatch("insert into students values(7,'jadeja',22,89.00)");
			
			statement.executeBatch();
			System.out.println("Successfully executed Batch.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
