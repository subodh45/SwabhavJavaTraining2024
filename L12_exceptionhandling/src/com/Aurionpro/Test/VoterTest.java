package com.Aurionpro.Test;
import com.Aurionpro.Exception.AgeInvalidException;
import com.Aurionpro.Model.*;

import java.util.Scanner;

public class VoterTest {
public static void main(String[] args) {
	
	Scanner scanner =new Scanner(System.in);
	
    System.out.println("enter voter id");
    int voterId =scanner.nextInt();
    
    System.out.println("enter first name ");
    String firstName=scanner.next();
    
    System.out.println("enter LAST Name ");
    String lastName=scanner.next();
    
    System.out.println("enter AGE ");
    int age = scanner.nextInt();
    
    Voter voter=null;
    try {
        	
    voter =new Voter(voterId,firstName,lastName,age);
    }
    catch(AgeInvalidException exception)
    {
    	System.out.println(exception.getMessage());
    }
    
    System.out.println(voter);
	
}
}
