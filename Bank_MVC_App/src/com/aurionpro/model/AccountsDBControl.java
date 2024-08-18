package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountsDBControl {

	private Connection connection;
	private Statement statement=null;
	private PreparedStatement prepareStatement=null ;
	ResultSet resultset=null;
	
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_app","root","root");
			System.out.println("Connection Successfull");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addAccount(int customerId, int accountNumber)
	{
		try {
			prepareStatement = connection.prepareStatement("insert into accounts (accountNumber,customerId ) values(?,?)");
			prepareStatement.setInt(1, accountNumber);
			prepareStatement.setInt(2, customerId);
			
			prepareStatement.executeUpdate();
			
			System.out.println("Account Created Successfully.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
