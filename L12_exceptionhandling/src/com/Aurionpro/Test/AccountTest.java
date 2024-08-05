package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.*;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("enter account number ");
			int accountNumber = scanner.nextInt();

			System.out.println("enter name ");
			String name = scanner.next();

			System.out.println("enter balance");
			double balance = scanner.nextDouble();

			Account account = new Account(accountNumber, name, balance);

			while (true) {
				System.out.println("1.deposit 2.withdraw 3.check Balance 4. exit");
				int choice = scanner.nextInt();

				if (choice == 1) {
					System.out.println("enter amount to be added .");
					double amount = scanner.nextDouble();
					account.deposit(amount);
				}
				if (choice == 2) {
					System.out.println("enter amount to withdraw.");
					double amount = scanner.nextDouble();

					account.withdraw(amount);
				}
				if (choice == 3) {
					System.out.println(account.getBalance());
				}
				if (choice == 4) {
					System.exit(0);
				}

			}
		} catch (Exception exception) {
			System.out.println("Error occur " + exception);
		}
	}
}
