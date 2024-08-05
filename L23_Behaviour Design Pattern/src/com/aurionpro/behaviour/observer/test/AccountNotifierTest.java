package com.aurionpro.behaviour.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.behaviour.observer.model.*;

public class AccountNotifierTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<INotify> notifiers = new ArrayList<>();

		
		System.out.println("which notification you want ");
		System.out.println("press 1 for SMS 2 for email 3 for whatsup 4 for exit .");
		int choice = sc.nextInt();

		while (choice!=4) {
			
			switch (choice) {
			case 1:
				notifiers.add(new SMSNotifier());
				break;
			case 2:
				notifiers.add(new EmailNotifier());
				break;
			case 4:
				break;
				
			default:
				System.out.println("invalid input");
			}
			
			System.out.println("which notification you want ");
			System.out.println("press 1 for SMS 2 for email 3 for whatsup 4 for exit .");
		    choice = sc.nextInt();

		}

		Account account = new Account(123, "Subodh", 100000.00, notifiers);
		
		account.deposit(1000);
		try {
		account.withdraw(-200);
		}
		catch(NegativeAmountException exception)
		{
			notifiers.forEach((notifier) -> notifier.notify(account, "InsufficientFundsException"));
		}
		catch(InsufficientFundsException exception) {
		notifiers.forEach((notifier) -> notifier.notify(account, "InsufficientFundsException"));
	}

	}
}
