package com.aurionpro.jdbc.transactionManagement.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagementModel {


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
	
	public void TransactionMethod()
	{
		try {
			statement = connection.createStatement();
			connection.setAutoCommit(false); 
			statement.executeUpdate("insert into students values(10,'jay',40,70.00)");
			statement.executeUpdate("insert into students values(11,'jaya',50,90.00)");
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
}
