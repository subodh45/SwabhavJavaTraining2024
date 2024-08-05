package com.aurionpro.Stream.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.aurionpro.Stream.model.*;

public class AccountStremTesting {
public static void main(String[] args) {
	
	List<Account>accounts = new ArrayList<Account>();
	accounts.add(new Account(123,"Subodhhhh", 10000));
	accounts.add(new Account(321,"Suhas", 100000));
	accounts.add(new Account(876,"Jateen",50000));
	
	
	Optional<Account> max = accounts.stream()
			.max((Account1,Account2) ->(int)(Account1.getBalance()- Account2.getBalance()));
	if(max.isPresent())
		System.out.println(max);
	
	accounts.stream().filter((Account)-> (Account.getName().length())>=7)
	                 .forEach((Account)-> System.out.println(Account.getName()+" "));
	
	double totalBalance = accounts.stream()
			.map((Account)-> Account.getBalance())
			.reduce((double) 0,(Balance1,Balance2) -> Balance1 + Balance2);
	        
	System.out.println("Total Balance is "+ totalBalance);
	
			
			
	
}
}
