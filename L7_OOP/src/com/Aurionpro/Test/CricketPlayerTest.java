package com.Aurionpro.Test;
import com.Aurionpro.Model.*;
import java.util.*;

public class CricketPlayerTest {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  int size=3;
	  CricketPlayer cricketPlayer[]=new CricketPlayer[size];
	  
	  for(int n =0;n<size;n++)
	  {
		  System.out.println("enter Player id ");
		  int playerId = sc.nextInt();
		  System.out.println("enter player name ");
		  String name = sc.next();
		  System.out.println("enter Number of matches ");
		  int numberOfMatches=sc.nextInt();
		  System.out.println("enter number of runs ");
		  int runs =sc.nextInt();
		  System.out.println("enter number of wickets ");
		  int wickets =sc.nextInt();
		  
		  cricketPlayer[n]=new CricketPlayer( playerId, name , numberOfMatches,runs, wickets);
		  
	  }
	  
	  for(int n=0;n<size;n++)
	  {
		  cricketPlayer[n].display();
		  cricketPlayer[n].average();
	  }
		  
}
}
