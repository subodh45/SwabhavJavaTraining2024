package com.aurionpro.jdbc.employee.test;

import java.util.Scanner;

import com.aurionpro.jdbc.employee.model.*;

public class EmployeeJDBCTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		EmployeeConnectJDBC connect = new EmployeeConnectJDBC();
		connect.ConnectiontoDB();
		System.out.println("Employee Management System ");
		while (true) {

			System.out.println(
					"enter 1:view Employee List  2. add Employee 3.delete Employee 4. update Employee 5. Exit ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				connect.GetDetails();
				break;
			case 2:
				connect.insertDetails();
				break;
			case 3:
				connect.deleteDetails();
				break;
			case 4:
				connect.updateDeatail();
				break;
			case 5:
				System.out.println("Thank you!");
				System.exit(0);
				break;
			default:
				System.out.println("enter valid input ");
				break;
			}
		}

	}
}
