package com.aurionpro.jdbc.SCM.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScmQueries {

	
	Connection connection=null;
	Statement statement=null;
	PreparedStatement preparedStatement;
	
	public void getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplychain_management","root","root");
			System.out.println("Connected Successfully.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//select ProductName ,SupplierName  from products left join suppliers on products.SupplierID = suppliers.SupplierID ;
	
	public void Query1()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select ProductName ,SupplierName  from products left join suppliers on products.SupplierID = suppliers.SupplierID");
			System.out.println(" List all products along with their supplier names");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ "\t" + rs.getString(2));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//Get all orders with their details (including product names and quantities
	public void Query2()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select orders.orderID ,OrderDate,OrderDetailID,ProductName ,quantity from orders  join orderdetails as o on orders.OrderID = o.OrderID  join products p on o.ProductID =p.ProductID  order by o.OrderID" );
			System.out.println("  Get all orders with their details (including product names and quantities" );
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "\t" + rs.getDate(2)+rs.getInt(3)+ rs.getString(4)+ rs.getInt(5));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
 
	// Find all suppliers who have supplied a specific product (e.g., ProductID = 1)
	
	public void Query3()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select  products.supplierID, supplierName , count(productID) as NoOFProduct  from products join suppliers  on  products.SupplierID = suppliers.SupplierID group by products.supplierID having NoOFProduct =1");
			System.out.println("  Find all suppliers who have supplied a specific product (e.g., ProductID = 1)");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) + "\t"+ rs.getInt(3));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
// List all products and their current inventory levels
	
	public void Query4()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select ProductName ,QuantityOnHand from products left join inventory on products.ProductID = inventory.ProductID;");
			System.out.println(" List all products and their current inventory levels");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+  "\t"+ rs.getInt(2));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Find all orders placed within the last month

	public void Query5()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select * from orders where OrderDate >now() - interval 1 month;");
			System.out.println(" Find all orders placed within the last month");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+  "\t"+ rs.getDate(2)+ "\t"+ rs.getInt(3));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Get total quantity ordered for each product
	
	public void Query6()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select ProductName , sum(quantity) as quantity from products p left join orderdetails o on p.ProductID = o.ProductID group by ProductName ");
			System.out.println(" Get total quantity ordered for each product" );
			while(rs.next())
			{
				System.out.println(rs.getString(1)+  "\t"+ rs.getInt(2));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Retrieve all orders along with the total amount spent for each order
	
	public void Query7()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select o.OrderID,OrderDate , sum(price) as Totalprice from orders  join orderdetails o on orders.OrderID = o.OrderID group by o.OrderID");
			System.out.println("Retrieve all orders along with the total amount spent for each order" );
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+  "\t"+ rs.getDate(2)+ "\t"+ rs.getInt(3));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void Query8()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select products.ProductName, count(products.SupplierID) as NOofsuppliers  from suppliers  join   products  \r\n" + 
					"       on  suppliers.SupplierID = products.SupplierID group by products.ProductName having NOofsuppliers>1");
			System.out.println("Find products supplied by more than one supplier");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ "\t" + rs.getInt(2));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Get the average inventory level for each product
	public void Query9()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("select products.ProductName ,avg(QuantityONHand) as inventorylevel from inventory left join products on inventory.ProductID = products.ProductID group by products.ProductID");
			System.out.println(" Get the average inventory level for each product");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+  "\t"+ rs.getDouble(2));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// List suppliers who have not supplied any products
	
	public void Query10()
	{
		try {
			statement = connection.createStatement();
			
			ResultSet rs= statement.executeQuery("SELECT s.SupplierID, s.SupplierName FROM Suppliers s LEFT JOIN Products p ON s.SupplierID = p.SupplierID WHERE p.ProductID IS NULL");
			System.out.println(" List suppliers who have not supplied any products");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+  "\t"+ rs.getString(2));
			}
			
			System.out.println("success !");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
