package com.aurionpro.jdbc.test;
import com.aurionpro.jdbc.model.*;

public class ConnectionTest {
public static void main(String[] args) {
	
	ConnectionDB connect = new ConnectionDB();
	connect.ConnectiontoDB();
	connect.GetDetails();
	//connect.insertDetails();
	//connect.updateDeatail();
	connect.deleteDetails();
	
	//connect.GetColumnDetails();
	connect.GetDetails();
}
}
