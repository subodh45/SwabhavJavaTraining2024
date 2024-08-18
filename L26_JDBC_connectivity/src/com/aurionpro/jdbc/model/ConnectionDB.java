package com.aurionpro.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionDB {
	Connection connection =null;
	Statement statement = null;
	PreparedStatement prepareStatement=null;
	
	public void ConnectiontoDB()
	{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
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
	
	public void insertDetails()
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter roll no ");
		 int rollno = scanner.nextInt();
		 System.out.println("enter name");
		 String name = scanner.next();
		 System.out.println("enter age");
		 int age = scanner.nextInt();
		 System.out.println("enter percentage ");
         double percent = scanner.nextDouble();		 
		
		 try {
			 prepareStatement = connection.prepareStatement("insert into students values(?,?,?,?)");
			 
			 prepareStatement.setInt(1, rollno);
			 prepareStatement.setString(2, name);
			 prepareStatement.setInt(3, age);
			 prepareStatement.setDouble(4, percent);
			 
			 prepareStatement.executeUpdate();
			 			
			System.out.println("success .");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateDeatail()
	{
		Scanner scanner = new Scanner(System.in);
		 System.out.println("enter roll no who u want to update ");
		  int rollno = scanner.nextInt();
		  
		  System.out.println("enter updated  name");
			 String name = scanner.next();
			 
			 try {
				prepareStatement = connection.prepareStatement("update students set name = ? where roll_no=?");
				
				prepareStatement.setString(1, name);
				prepareStatement.setInt(2, rollno);
				prepareStatement.executeUpdate();
				 System.out.println("success .");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	public void deleteDetails()
	{
		Scanner scanner = new Scanner(System.in);
		 System.out.println("enter roll no who u want to delete ");
		  int rollno = scanner.nextInt();
		  			 
			 try {
				prepareStatement = connection.prepareStatement("delete from students where roll_no=?");
						
				prepareStatement.setInt(1, rollno);
				prepareStatement.executeUpdate();
				 System.out.println("success .");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	public void GetColumnDetails()
	{
		try {
			statement = connection.createStatement();
			ResultSet students= statement.executeQuery("select * from students");
			ResultSetMetaData resultSetMetaData = students.getMetaData();
			
			for(int i=1;i<= resultSetMetaData.getColumnCount(); i++)
			{
				System.out.println("Column name ="+ resultSetMetaData.getColumnName(i));
				System.out.println("Column type ="+ resultSetMetaData.getColumnTypeName(i));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
