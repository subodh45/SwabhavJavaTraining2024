package com.aurionpro.jdbc.employee.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeConnectJDBC {
	
	Connection connection =null;
	Statement statement = null;
	PreparedStatement prepareStatement=null ;
	
	public void ConnectiontoDB()
	{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			System.out.println("connection Successfull.");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void GetDetails()
	{
		try {
			
			statement = connection.createStatement();
			ResultSet employees= statement.executeQuery("select * from employees");
					
			while(employees.next())
			{
				System.out.println( employees.getInt(1) +"  "+ employees.getString(2) + "  " +employees.getDouble(3));				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insertDetails()
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter emp id ");
		 int empid = scanner.nextInt();
		 System.out.println("enter name");
		 String name = scanner.next();
		 System.out.println("enter salary ");
         double salary = scanner.nextDouble();		 
		
		 try {
			 prepareStatement = connection.prepareStatement("insert into employees values(?,?,?)");
			 
			 prepareStatement.setInt(1, empid);
			 prepareStatement.setString(2, name);
			 prepareStatement.setDouble(3, salary);
			 
			 prepareStatement.executeUpdate();
			 			
			System.out.println("successly added to database.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateDeatail()
	{
		Scanner scanner = new Scanner(System.in);
		 System.out.println("enter empId who u want to update ");
		  int empid = scanner.nextInt();
		  
		  System.out.println("enter updated  name");
			 String name = scanner.next();
			 
			 try {
				prepareStatement = connection.prepareStatement("update employees set name = ? where empid=?");
				
				prepareStatement.setString(1, name);
				prepareStatement.setInt(2, empid);
				prepareStatement.executeUpdate();
				 System.out.println("successly updated .");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	public void deleteDetails()
	{
		Scanner scanner = new Scanner(System.in);
		 System.out.println("enter empid who u want to delete ");
		  int empid = scanner.nextInt();
		  			 
			 try {
				prepareStatement = connection.prepareStatement("delete from employees where empid=?");
						
				prepareStatement.setInt(1, empid);
				prepareStatement.executeUpdate();
				 System.out.println("success .");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	

}
